package com.controlStatements;

import java.util.Arrays;

public class EnhancedFor {
    public static void main(String[] args) {
        int numArr[] = {20, 40, 30, 60, 70};
        System.out.println("numArr: "+Arrays.toString(numArr));

        System.out.print("EnhancedForLoop: ");
        for ( int num: numArr){
            System.out.print(num+" ");
        }
        System.out.println();


        for(int i=0; i<numArr.length;i++){
            System.out.print(numArr[i] +" ");
        }
        System.out.println();

    }
}
