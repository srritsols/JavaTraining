package com.arrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int numArr[]={10, 20, 15, 44, 40, 83, 70};
        String name[]={"Joe", "Leo", "Ryan", "Sean", "Joy"};

        System.out.println("Before: "+ Arrays.toString(numArr));
        Arrays.sort(numArr);
        System.out.println("After: "+ Arrays.toString(numArr));
        System.out.println("Before: "+ Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("After: "+ Arrays.toString(name));
    }
}
