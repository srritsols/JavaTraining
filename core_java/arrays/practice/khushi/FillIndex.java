package arrays.practice.khushi;

import java.util.Arrays;

public class FillIndex {
	public static void main(String[]args) {
		int arr1[]= {1,2,3,4,5,6,7,8};
		
		System.out.println("Source Array: "+ Arrays.toString(arr1));
		int fromIndex=3;
		int val=14;
		for(int i=arr1.length-1;i>fromIndex;i--) {
			arr1[i]=arr1[i-1];
		}
		arr1[fromIndex] = val;
		System.out.println("after adding: "+ Arrays.toString(arr1));
	}

}
