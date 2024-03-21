/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: CustomerDataAdapter.java
 * Description: Adapter class to integrate USB customer data retrieval into HTTPS.
 */

package edu.bu.met.cs665.adapters;

// Importing the new system interface
import edu.bu.met.cs665.interfaces.CustomerDataHttps;
// Importing the legacy system interface
import edu.bu.met.cs665.interfaces.CustomerDataUsb;

/**
 * Adapter class to allow the old USB customer data system to be used as if it is the new HTTPS 
 * system.
 * Implements the CustomerDataHttps interface to adapt the CustomerDataUsb interface.
 */
public class CustomerDataAdapter implements CustomerDataHttps {
  
  // Reference to the old system that retrieves customer data via USB
  private CustomerDataUsb oldSystem;
  
  /**
   * Constructs a CustomerDataAdapter with a reference to the old USB system.
   * The adapter wraps the legacy USB system to be compatible with the new HTTPS interface.
   *
   * @param oldSystem An instance of CustomerDataUsb, the legacy data retrieval system.
   */
  public CustomerDataAdapter(CustomerDataUsb oldSystem) {
    this.oldSystem = oldSystem;
  }

  /**
   * Delegates the printCustomer method call to the old USB system.
   * This allows clients to use the new HTTPS interface to print customer data via USB.
   *
   * @param customerId The unique identifier of the customer whose data is to be printed.
   */
  @Override
  public void printCustomer(int customerId) {
    oldSystem.printCustomer(customerId);
  }

  /**
   * Delegates the getCustomerHttps method call to the old USB system.
   * This method adapts the HTTPS retrieval method call to the corresponding USB method.
   *
   * @param customerId The unique identifier of the customer whose data is to be retrieved via USB.
   */
  @Override
  public void getCustomerHttps(int customerId) {
    oldSystem.getCustomer_Usb(customerId);
  }

}
