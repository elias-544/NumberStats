package com.elias;

import java.util.Scanner;

/**
 * date 06/12/2024
 * Number Properties Java Class
 * @author Elias Khatoun
 */

public class NumberStats {

    /**
     * Main Method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Get the user's input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        MyNumber number = new MyNumber(num);

        // Printing out number stats
        System.out.println(number.isEven());
        System.out.println(number.isOdd());
        System.out.println(number.isPrime());

    }
}


/**
 * MyNumber Class
 */
class MyNumber {

    /**
     * Integer value of the object
     */
    private int val;


    /**
     * Constructor for the MyNumber class
     * @param val The value of the object
     */
    public MyNumber(int val) {
        this.val = val;
    }


    /**
     * Getter for the object's value
     * @return The object's value
     */
    public int getVal() {
        return val;
    }


    /**
     * Checks if the object's value is odd
     * @return Whether the object's value is odd
     */
    public boolean isOdd() {
        return this.val % 2 != 0;
    }


    /**
     * Checks if the object's value is even
     * @return Whether the object's value is even
     */
    public boolean isEven() {
        return this.val % 2 == 0;
    }


    /**
     * Checks if the object's value is prime
     * @return Whether the object's value is prime
     */
    public boolean isPrime() {
        if (this.val == 1) {
            return false;
        }
        for (int i = 2; i < this.val; i++) {
            if (this.val % i == 0) {
                return false;
            }
        }
        return true;
    }
}