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
 * LMU id 23048604
 */
public class BinarySearch {
 public CustomerModel searchByName(String searchValue, List<CustomerModel> customerList,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(customerList.get(mid).getPassportnumber()) == 0) {
            return customerList.get(mid);
        } else if (searchValue.compareToIgnoreCase(customerList.get(mid).getPassportnumber()) < 0) {
            return searchByName(searchValue, customerList, left, mid - 1);
        } else {
            return searchByName(searchValue, customerList, mid + 1, right);
        }

    }    
}
