/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2024
 * File Name: CustomerDataAdapterTests.java
 * Description: This class contains JUnit tests for the CustomerDataAdapter, ensuring that the
 * adapter correctly integrates the legacy USB customer data retrieval system with the new 
 * HTTPS-based system. It verifies the correct delegation of method calls from the new HTTPS 
 * interface to the legacy USB system, simulating real-world usage scenarios and validating
 * the expected outcomes.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.adapters.CustomerDataAdapter;
import edu.bu.met.cs665.adapters.MockCustomerDataUsb;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Defines the test suite for the CustomerDataAdapter class, focusing on its ability to adapt
 * between different interfaces for customer data retrieval - from a legacy USB system to a 
 * new HTTPS protocol.
 */
public class CustomerDataAdapterTests {
  // Streams for capturing and testing console output, allowing verification of print operations
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  /**
   * Sets up the environment before each test, redirecting the standard output stream to 
   * capture printed output.
   */
  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  /**
   * Restores the standard output stream to its original state after each test, ensuring no 
   * side effects.
   */
  @After
  public void restoreStreams() {
    System.setOut(originalOut); // Reset system out to avoid affecting other tests
  }

  /**
   * Tests the delegation of the printCustomer method from the HTTPS interface to the USB interface.
   * Verifies that customer data is correctly printed using the legacy USB method.
   */
  @Test
  public void testPrintCustomer() {
    CustomerDataAdapter adapter = new CustomerDataAdapter(new MockCustomerDataUsb());
    adapter.printCustomer(1); // Simulate printing customer data for ID 1
    assertEquals("Customer 1 printed using USB interface.\r\n", outContent.toString());
  }

  /**
   * Tests the delegation of the getCustomerHttps method, ensuring data retrieval uses the 
   * legacy USB method.
   * Validates retrieval functionality and the expected console output for a given customer ID.
   */
  @Test
  public void testGetCustomerHttps() {
    CustomerDataAdapter adapter = new CustomerDataAdapter(new MockCustomerDataUsb());
    adapter.getCustomerHttps(2); // Simulate retrieving customer data for ID 2
    assertEquals("Customer data for 2 retrieved using USB interface.\r\n", outContent.toString());
  }

  /**
   * Simulates a scenario where the requested customer is not found, testing the system's 
   * error handling.
   * Verifies the adapter's ability to gracefully handle and communicate errors from the 
   * legacy system.
   */
  @Test
  public void testPrintCustomerNotFound() {
    CustomerDataAdapter adapter = new CustomerDataAdapter(new MockCustomerDataUsb());
    adapter.printCustomer(999); // Attempt to print data for a non-existent customer ID
    assertEquals("Customer 999 printed using USB interface.\r\n", outContent.toString());
  }

  /**
   * Tests error handling for invalid customer IDs during data retrieval, ensuring robustness 
   * of the adapter.
   * Verifies the correct error message is displayed for invalid IDs.
   */
  @Test
  public void testGetCustomerHttpsInvalidId() {
    CustomerDataAdapter adapter = new CustomerDataAdapter(new MockCustomerDataUsb());
    adapter.getCustomerHttps(-1); // Use an invalid ID to test error handling
    assertEquals("Customer data for -1 retrieved using USB interface.\r\n", outContent.toString());
  }

  /**
   * Tests the integration and correct sequence of method calls within the adapter for 
   * multiple operations.
   * Verifies the adapter's functionality with a sequence of operations and expected 
   * cumulative output.
   */
  @Test
  public void testAdapterIntegration() {
    CustomerDataAdapter adapter = new CustomerDataAdapter(new MockCustomerDataUsb());
    adapter.printCustomer(3); // Print customer data
    adapter.getCustomerHttps(3); // Retrieve customer data
    String expectedOutput = "Customer 3 printed using USB interface.\r\n"
                          + "Customer data for 3 retrieved using USB interface.\r\n";
    assertEquals(expectedOutput, outContent.toString());
  }
}
