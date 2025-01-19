/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelagencymanagementsystem.util;


import java.util.regex.Pattern;

/**
 * Utility class for validating input fields.
 * Provides methods to validate common user input like names, email, phone numbers, and IDs.
 * 
 * @author Sabin Adhikari
 * LMU id 23048604
 */
public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern Passport_PATTERN = Pattern.compile("^\\d{5}$"); // Adjusted for 5-digit Passport ID
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^98\\d{8}$");
    private static final Pattern ADDRESS_PATTERN = Pattern.compile("^[a-zA-Z\\s,]+$");

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the Passport is exactly 5 digits.
     *
     * @param id the Passport to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPassport(String id) {
        return !isNullOrEmpty(id) && Passport_PATTERN.matcher(id).matches();
    }

    /**
     * Validates if the email is in a proper format.
     *
     * @param email the email to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidEmail(String email) {
        return !isNullOrEmpty(email) && EMAIL_PATTERN.matcher(email).matches();
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param phone the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPhone(String phone) {
        return !isNullOrEmpty(phone) && PHONE_PATTERN.matcher(phone).matches();
    }

    /**
     * Validates if the address contains letters, spaces, and commas only.
     *
     * @param address the address to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAddress(String address) {
        return !isNullOrEmpty(address) && ADDRESS_PATTERN.matcher(address).matches();
    }

    /**
     * Generic field validation utility that checks for non-empty and specific criteria.
     *
     * @param value      the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
}

