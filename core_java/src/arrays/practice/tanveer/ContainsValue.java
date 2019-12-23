package com.arrays;

import java.util.Arrays;

public class ContainsValue {
    public static void main(String[] args) {
        int numArr[]={10, 20, 15, 44, 40, 83, 70};
        ContainsValue cv = new ContainsValue();

        System.out.println("numArr: "+ Arrays.toString(numArr));
        System.out.println("15 >> "+cv.contains(numArr, 15));
        System.out.println("25 >> "+cv.contains(numArr, 25));
    }

    private boolean contains(int[] numArr, int item) {
        for (int num:numArr){
            if(num==item){
                return  true;
            }
        }
        return false;
    }
}
