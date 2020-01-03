package com.arrays;

import java.util.Arrays;

public class FillIndex {
    public static void main(String[] args) {
        int numArr[]={10, 20, 15, 44, 40, 83, 70};
        System.out.println("numArr: "+ Arrays.toString(numArr));
        System.out.println("Length: "+numArr.length);
        int fromIndex = 3;
        int value = 981;

        for (int i = numArr.length-1;i>fromIndex;i--){
            numArr[i]=numArr[i-1];
        }
        System.out.println("Length: "+numArr.length);
        numArr[fromIndex]=value;
        System.out.println("numArr["+value+"] at index "+fromIndex);
        System.out.println("numArr: "+Arrays.toString(numArr));
        System.out.println("Length: "+numArr.length);

    }
}
