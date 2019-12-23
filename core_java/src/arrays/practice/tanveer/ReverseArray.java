package com.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int numArr[]={10, 20, 15, 44, 40, 83, 70};
        System.out.println("Before: "+ Arrays.toString(numArr));
        for(int i=0; i<numArr.length/2; i++){
            int temp = numArr[i];
            numArr[i] = numArr[numArr.length -1 - i];
            numArr[numArr.length -1 -i] = temp;
        }
        System.out.println("After: "+ Arrays.toString(numArr));
    }
}
