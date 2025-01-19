/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelagencymanagementsystem.controller.algorithm;

import com.travelagencymanagementsystem.model.CustomerModel;
import java.util.List;
/**
 *
 * @author Sabin Adhikari
 * LMuid 23048604
 */
public class InsertionSort {

    /**
     * Sorts a list of customers by their names alphabetically using the Insertion Sort algorithm.
     *
     * @param customerList The list of customers to be sorted.
     * @param isAscending  True for ascending order, false for descending order.
     */
    public static void sortByCustomerName(List<CustomerModel> customerList, boolean isAscending) {
        int n = customerList.size();

        for (int i = 1; i < n; i++) {
            // Extract the current customer object
            CustomerModel currentCustomer = customerList.get(i);
            String currentName = currentCustomer.getCustomerName();

            int j = i - 1;

            // Compare and shift customers in the correct order
            while (j >= 0 && (isAscending
                    ? customerList.get(j).getCustomerName().compareToIgnoreCase(currentName) > 0
                    : customerList.get(j).getCustomerName().compareToIgnoreCase(currentName) < 0)) {
                customerList.set(j + 1, customerList.get(j));
                j--;
            }

            // Insert the current customer into its correct position
            customerList.set(j + 1, currentCustomer);
        }
    }
}

