/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: CustomerDataHttps.java
 * Description: Defines methods for customer data retrieval via HTTPS.
 */

package edu.bu.met.cs665.interfaces;

/**
 * The interface for customer data interactions using HTTPS.
 * It specifies how customer data is printed and retrieved through a secure HTTPS connection.
 */
public interface CustomerDataHttps {
  
  /**
   * Print details of a customer by their ID.
   * This method should be implemented to print customer data over an HTTPS connection.
   *
   * @param customerId The ID of the customer whose details are to be printed.
   */
  void printCustomer(int customerId);
  
  /**
   * Retrieve a customer's data using their ID.
   * This method should be implemented to fetch customer data securely over HTTPS.
   *
   * @param customerId The ID of the customer to retrieve data for.
   */
  void getCustomerHttps(int customerId);
}
