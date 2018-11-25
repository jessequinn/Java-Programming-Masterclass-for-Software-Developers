package com.jessequinn;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
//        int returnedMin = findMin(readIntegers(count));

//        System.out.println("min = " + returnedMin);

        Arrays.sort(returnedArray);

        System.out.println("Minimum = " + returnedArray[0]);

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

//    private static int findMin(int[] array) {
//
//        int min = Integer.MAX_VALUE;
//
//        for(int i=0; i<array.length; i++) {
//            int value = array[i];
//
//            if(value < min) {
//                min = value;
//            }
//        }
//
//        return min;
//    }
}