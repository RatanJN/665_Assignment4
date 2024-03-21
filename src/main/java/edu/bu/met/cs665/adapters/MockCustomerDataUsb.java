/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: MockCustomerDataUsb.java
 * Description: This class is a mock implementation of the CustomerDataUsb interface.
 */

package edu.bu.met.cs665.adapters;

// Import the CustomerDataUsb interface
import edu.bu.met.cs665.interfaces.CustomerDataUsb;

/**
 * A mock implementation of the CustomerDataUsb interface for testing purposes.
 * This class simulates the behavior of USB-based customer data retrieval systems.
 */
public class MockCustomerDataUsb implements CustomerDataUsb {

  /**
   * Simulates printing customer information using a USB interface.
   * Prints a message to the console indicating that the customer data has been printed.
   *
   * @param customerId The ID of the customer whose information is being printed.
   */
  @Override
  public void printCustomer(int customerId) {
    // Simulate printing to an external device connected via USB.
    System.out.println("Customer " + customerId + " printed using USB interface.");
  }

  /**
   * Simulates retrieving customer data using a USB interface.
   * Prints a message to the console indicating that the customer data has been retrieved.
   *
   * @param customerId The ID of the customer whose data is being retrieved.
   */
  @Override
  public void getCustomer_Usb(int customerId) {
    // Simulate data retrieval from an external device connected via USB.
    System.out.println("Customer data for " + customerId + " retrieved using USB interface.");
  }
}
