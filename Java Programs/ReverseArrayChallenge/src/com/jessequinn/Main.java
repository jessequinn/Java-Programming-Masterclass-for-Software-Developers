package com.jessequinn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};

        System.out.println("Array = " + Arrays.toString(array));

//        boxing solution considered expensive
        int[] nums = Arrays.stream(array).boxed().sorted((i1, i2) -> Integer.compare(i2, i1)).mapToInt(Integer::intValue).toArray();

//        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(nums));
    }

//    private static void reverse(int[] array) {
//
//        int maxIndex = array.length - 1;
//        int halfLength = array.length / 2;
//
//        for (int i = 0; i < halfLength; i++) {
//            int temp = array[i];
//            array[i] = array[maxIndex - i];
//            array[maxIndex - i] = temp;
//        }
//    }
}
