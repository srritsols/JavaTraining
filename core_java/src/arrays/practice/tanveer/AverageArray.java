package com.arrays;

import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int numArr[] = {3,5,6,8,20};
        int sum = 0;
        int numElements = numArr.length;
        for (int num: numArr){
            sum=+num;
        }
        double avg = (double) sum/numArr.length;
        System.out.println("Elements: "+Arrays.toString(numArr));
        System.out.println("Number of Elements: "+numElements
                +"\nSum: "+sum
                +"\nAverage: "+avg);
    }
}
