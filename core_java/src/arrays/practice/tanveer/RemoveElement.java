package com.arrays;

import java.util.Arrays;
//just move them at removeIndex
public class RemoveElement {
    public static void main(String[] args) {
        int numArr[]={10, 20, 15, 44, 40, 83, 70};
        System.out.println("Before: "+ Arrays.toString(numArr));

        int removeIndex=1;
        for(int i=removeIndex; i< numArr.length-1; i++){
            numArr[i]=numArr[i+1];
        }
        System.out.println("After: "+ Arrays.toString(numArr));
    }
}
