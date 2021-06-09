package com.mindera.school;

import java.util.Scanner;

public class Arrays {
    /**
     * Create a function (getNegativeNumbers) that takes an array of integers and returns the number of elements in the
     * array that are negative numbers.
     */
    public int getNegativeNumbers(int[] array) {
        int negative = 0;

        for (int i = 10; i < array.length; i++) {
            if (array[i] < 0) {
                negative = negative + 1;
            }
            System.out.println(negative);
        }

        return 0;

    }

    /**
     * Create a function (getNumberOfTimes) that takes an array of integers and an integer and returns the number of
     * times that number appears in the array.
     */
    public int getNumberOfTimes(int[] array, int number) {
        return 0;

    }

    /**
     * Create a function (getBooleanArray) that takes an array of integers and returns an array of booleans.
     * If the number is positive it will be replaced by true.
     * If it is negative or zero by false.
     */
    public boolean[] getBooleanArray(int[] array) {

        return null;
    }

    /**
     * Create a function (getLargestNumber) that takes an array of integers and returns the position of the largest
     * number.
     */
    public int getLargestNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o" + (i + 1) + " numero");
            array[i] = scanner.nextInt();
        }

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }


        return 0;

    }


    /**
     * Create a function (getOddEvenArray) that takes an array of integers and replaces the odd numbers with -1 and the
     * even numbers with 1.
     */

    public int[] getOddEvenArray(int[] array) {
        return null;
    }

    /**
     * Create a function (sumAllElements) that takes an array of integers and returns the sum of all values
     */
    public int sumAllElements(int[] array) {
        return 0;
    }

    /**
     * Create a function (removeElement) that takes an array of integers and a number and removes it from the array;
     */
    public int[] removeElement(int[] array, int number) {
        return null;
    }

    /**
     * Create a function (orderArray) that takes an array of integers and returns the array ordered from largest to
     * smallest.
     */
    public int[] orderArray(int[] array) {
        return null;
    }
}
