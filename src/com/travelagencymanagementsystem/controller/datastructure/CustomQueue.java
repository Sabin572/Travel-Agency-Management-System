/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travelagencymanagementsystem.controller.datastructure;

import com.travelagencymanagementsystem.model.CustomerModel;
import java.util.LinkedList;

/**
 *
 * <p>Features include:</p>
 * <ul>
 * <li>Capacity limit for the queue.</li>
 * <li>Ability to check if the queue is empty or full.</li>
 * </ul>
 *
 * <p>Note: This implementation assumes that the queue operations are not accessed
 * concurrently.</p>
 * 
 * @author Sabin Adhikari
 * LMU id 23048604
 */
public class CustomQueue {

    private LinkedList<CustomerModel> travelList; // Internal storage for the queue.
    private int capacity; // Maximum number of elements the queue can hold.

    /**
     * Constructs a CustomQueue with the specified capacity.
     *
     * @param capacity the maximum number of elements the queue can hold.
     * @throws IllegalArgumentException if the specified capacity is less than or equal to zero.
     */
    public CustomQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        travelList = new LinkedList<>();
        this.capacity = capacity;
    }

    /**
     * Removes and returns the first element from the queue.
     *
     * @return the first CustomerModel in the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public CustomerModel deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove from an empty queue.");
        }
        return travelList.removeFirst();
    }

    /**
     * Adds a new element to the end of the queue if it is not full.
     *
     * @param customerModel the CustomerModel to be added to the queue.
     * @throws IllegalStateException if the queue is full.
     */
    public void enQueue(CustomerModel customerModel) {
        if (isFull()) {
            throw new IllegalStateException("Cannot add to a full queue.");
        }
        travelList.addLast(customerModel);
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first CustomerModel in the queue.
     * @throws IllegalStateException if the queue is empty.
     */
    public CustomerModel peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek into an empty queue.");
        }
        return travelList.getFirst();
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the number of elements in the queue.
     */
    public int size() {
        return travelList.size();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return travelList.isEmpty();
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue has reached its capacity, false otherwise.
     */
    public boolean isFull() {
        return travelList.size() == capacity;
    }
}
