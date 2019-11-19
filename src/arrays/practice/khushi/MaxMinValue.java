package arrays.practice.khushi;

import java.util.Arrays;

public class MaxMinValue {
	public static void main(String[]args){
	
		int arr1[]= {9,7,80,56,73,25,01,19};
		Arrays.sort(arr1);
		System.out.println("Sorted array: " +Arrays.toString(arr1));
		System.out.println("Minimum: "+ arr1[0]);
		System.out.println("Maximum: "+ arr1[arr1.length-1]);
	}
}
