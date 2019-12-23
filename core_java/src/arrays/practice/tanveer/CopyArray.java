package com.arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int numArr[] = {10, 20, 40, 15, 44, 21, 83, 73};
        int copyArr[] = new int[numArr.length];
        int count=0;

        System.out.println("copyArr: "+ Arrays.toString(copyArr));
        for (int num:numArr){
            copyArr[count]=num;
            count++;
        }
        System.out.println("numArr: "+ Arrays.toString(numArr));
        System.out.println("copyArr: "+ Arrays.toString(copyArr));
    }
}
