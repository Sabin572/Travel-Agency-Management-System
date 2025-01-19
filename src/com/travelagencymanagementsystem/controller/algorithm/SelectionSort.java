package com.travelagencymanagementsystem.controller.algorithm;

import com.travelagencymanagementsystem.model.CustomerModel;

import java.util.List;
/**
 *
 * @author Sabin Adhikari
 * LMuid 23048604
 */
public class SelectionSort {

    /**
     * Sorts the given list of customers by passport number using the Selection Sort algorithm.
     *
     * @param customers  List of CustomerModel objects to sort.
     * @param isAscending True for ascending order, false for descending.
     */
    public static void sortByPassportNumber(List<CustomerModel> customers, boolean isAscending) {
        for (int i = 0; i < customers.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < customers.size(); j++) {
                String currentPassport = customers.get(j).getPassportnumber();
                String minPassport = customers.get(minIndex).getPassportnumber();

                if (isAscending) {
                    if (currentPassport.compareTo(minPassport) < 0) {
                        minIndex = j;
                    }
                } else {
                    if (currentPassport.compareTo(minPassport) > 0) {
                        minIndex = j;
                    }
                }
            }
            // Swap elements in the list
            CustomerModel temp = customers.get(minIndex);
            customers.set(minIndex, customers.get(i));
            customers.set(i, temp);
        }
    }
}