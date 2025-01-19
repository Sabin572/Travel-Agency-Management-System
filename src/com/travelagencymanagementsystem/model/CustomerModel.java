package com.travelagencymanagementsystem.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Sabin Adhikari
 * LMU id 23048604
 */
public class CustomerModel {
    private String passportNumber;
    private String customerName;
    private String phone;
    private String email;
    private String address;
    private String packages;
    private LocalDate travelDate; // Changed to LocalDate

    // Default constructor
    public CustomerModel() {
    }

    // Parameterized constructor
    public CustomerModel(String passportNumber, String customerName, String phone, String email, String address, String packages, LocalDate travelDate) {
        this.passportNumber = passportNumber;
        this.customerName = customerName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.packages = packages;
        this.travelDate = travelDate; // Assign the travelDate parameter
    }

    // Getters and Setters
    public String getPassportnumber() {
        return passportNumber;
    }

    public void setPassportnumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public LocalDate getTravelDate() {
        return travelDate; // Return the value of travelDate
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate; // Assign the value to the field
    }

    // Method to set travel date from a string
    public void setTravelDateFromString(String travelDateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.travelDate = LocalDate.parse(travelDateString, formatter);
        } catch (DateTimeParseException e) {
            e.printStackTrace(); // Handle the exception (e.g., log it or throw a custom exception)
        }
    }

    // Method to get travel date as a formatted string
    public String getTravelDateAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return travelDate != null ? travelDate.format(formatter) : null;
    }
}