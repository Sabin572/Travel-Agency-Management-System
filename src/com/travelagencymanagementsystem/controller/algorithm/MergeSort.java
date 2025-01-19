/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelagencymanagementsystem.controller.algorithm;
/**
 *
 * @author Sabin Adhikari
 * LMuid 23048604
 */
import com.travelagencymanagementsystem.model.CustomerModel;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    /**
     * Sorts a list of customers by their travel date using the Merge Sort algorithm.
     *
     * @param customerList The list of customers to be sorted.
     * @param isAscending  True for ascending order, false for descending order.
     */
    public static void sortByTravelDate(List<CustomerModel> customerList, boolean isAscending) {
        if (customerList.size() <= 1) {
            return; // Base case: list is already sorted
        }

        int mid = customerList.size() / 2;

        // Split the list into two halves
        List<CustomerModel> left = new ArrayList<>(customerList.subList(0, mid));
        List<CustomerModel> right = new ArrayList<>(customerList.subList(mid, customerList.size()));

        // Recursively sort both halves
        sortByTravelDate(left, isAscending);
        sortByTravelDate(right, isAscending);

        // Merge the sorted halves
        merge(customerList, left, right, isAscending);
    }

    /**
     
     *
     * @param customerList The original list to store the merged results.
     * @param left        
     * @param right       
     * @param isAscending  True for ascending order, false for descending order.
     */
    private static void merge(List<CustomerModel> customerList, List<CustomerModel> left, List<CustomerModel> right, boolean isAscending) {
        int i = 0, j = 0, k = 0;

        // Merge elements based on the travel date
        while (i < left.size() && j < right.size()) {
            boolean condition = isAscending
                    ? left.get(i).getTravelDate().compareTo(right.get(j).getTravelDate()) <= 0
                    : left.get(i).getTravelDate().compareTo(right.get(j).getTravelDate()) >= 0;

            if (condition) {
                customerList.set(k++, left.get(i++));
            } else {
                customerList.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements from the left sublist
        while (i < left.size()) {
            customerList.set(k++, left.get(i++));
        }

        // Copy remaining elements from the right sublist
        while (j < right.size()) {
            customerList.set(k++, right.get(j++));
        }
    }
}

