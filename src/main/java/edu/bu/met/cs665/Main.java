/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/20/2024
 * File Name: Main.java
 * Description: Demonstrates the use of the adapter pattern for customer data systems.
 */

package edu.bu.met.cs665;

// Import adapter and mock classes for demonstration
import edu.bu.met.cs665.adapters.CustomerDataAdapter;
import edu.bu.met.cs665.adapters.MockCustomerDataUsb;
// Import interfaces for USB and HTTPS data handling
import edu.bu.met.cs665.interfaces.CustomerDataHttps;
import edu.bu.met.cs665.interfaces.CustomerDataUsb;

/**
 * The Main class demonstrates the integration of legacy USB data retrieval with the new HTTPS
 * interface.
 */
public class Main {

  /**
   * The main method serves as the entry point of the program to demonstrate the adapter usage.
   */
  public static void main(String[] args) {
    // Instantiate the mock USB system to simulate legacy operations
    CustomerDataUsb legacySystem = new MockCustomerDataUsb();

    // Create the adapter to conform the USB system to the HTTPS interface
    CustomerDataHttps adapter = new CustomerDataAdapter(legacySystem);

    // Example scenario: print customer info using the new interface over legacy USB system
    System.out.println("Scenario 1: Print customer using the new system's interface");
    adapter.printCustomer(1);

    // Example scenario: retrieve customer data using the new HTTPS interface method
    System.out.println("\nScenario 2: Get customer data using the new system's interface");
    adapter.getCustomerHttps(2);

    // Additional scenarios can be implemented to showcase other functionalities
  }
}
