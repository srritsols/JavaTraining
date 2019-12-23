package com.arrays;

import java.util.Arrays;

public class MaxMinValue {
    public static void main(String[] args) {
        int numArr[]={10, 20, 15, 44, 40, 83, 70};
        System.out.println("Before: "+Arrays.toString(numArr));
        Arrays.sort(numArr);
        System.out.println("After:  "+Arrays.toString(numArr));
        System.out.println("Min: "+numArr[0]);
        System.out.println("Max: "+numArr[numArr.length-1]);
    }
}
