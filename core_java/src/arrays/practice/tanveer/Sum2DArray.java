package com.arrays;

public class Sum2DArray {
    public static void main(String[] args) {
        int numArr[][]={
                {10, 20, 15, 44, 40, 83, 70},
                {40, 32, 67, 91, 55}
        };
        int sum = 0;

        for(int num:numArr[0]){
            sum+=num;
        }
        for(int num:numArr[1]){
            sum+=num;
        }
        System.out.println("Total: "+sum);
    }
}
