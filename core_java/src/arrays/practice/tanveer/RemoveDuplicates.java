package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int numArr[]={10, 20, 83, 70, 15, 44, 40, 83, 70};
        System.out.println("Original: "+Arrays.toString(numArr));

        Set<Integer> hs = new HashSet<>();
        for (int num:numArr){
            hs.add(num);
        }
        System.out.println("After: "+hs.toString());
        System.out.println("Array: "+Arrays.toString(hs.toArray()));

        //setting value in array
        int numArrNoDuplicate[]=new int[hs.size()];
        int i=0;
        for(Integer val:hs){
            numArrNoDuplicate[i]=val;
            i++;
        }
        System.out.println("numArrNoDuplicate: "+Arrays.toString(numArrNoDuplicate));

    }
}
