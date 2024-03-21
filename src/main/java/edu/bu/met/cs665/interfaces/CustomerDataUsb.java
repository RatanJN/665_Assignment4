/**
 * Name: Ratan Jagath Naik
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: CustomerDataUsb.java
 * Description: This interface defines methods for handling customer data via USB.
 */

package edu.bu.met.cs665.interfaces;

/**
 * Represents the interface for customer data interactions over USB.
 * This interface includes methods for printing and retrieving customer data through USB.
 */
public interface CustomerDataUsb {
  
  /**
   * Prints the details of a customer based on their ID.
   * This method simulates the action of printing customer data using a USB connection.
   *
   * @param customerId the unique identifier of the customer to be printed
   */
  void printCustomer(int customerId);
  
  /**
   * Retrieves customer data based on the provided customer ID.
   * This method simulates the action of retrieving customer data from a USB source.
   *
   * @param customerId the unique identifier of the customer whose data is to be retrieved
   */
  void getCustomer_Usb(int customerId);
}
