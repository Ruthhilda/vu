/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author mukis
 */

public class vu {
    
    public static void main(String[] args) {
        
        // Call the calculatePay method here
        // Employee A
        System.out.print("Employee A\n");
        calculatePay(28000.00, 35);

        // Employee B
        System.out.print("Employee B\n");
        calculatePay(35000.00, 45);

        // Employee C
        System.out.print("Employee C\n");
        calculatePay(38000.00, 75);
    }

    // Method to calculate total pay
    public static void calculatePay(double basePay, int hoursWorked) {
        
        // constants
        final double MINIMUM_WAGE = 40000.00;
        final int MAX_HOURS = 60;

        // Check for minimum wage requirement
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay is below the minimum wage of UGX " + MINIMUM_WAGE);
            return;
        }

        // Check for maximum hours worked requirement
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceed the maximum limit of " + MAX_HOURS + " hours.");
            return;
        }

        double totalPay;
        if (hoursWorked <= 40) {
            // Regular pay calculation for hours up to 40
            totalPay = hoursWorked * basePay;
        } else {
            // Pay calculation including overtime for hours above 40
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }
        System.out.println("Total pay is UGX " + totalPay);
    }

}
