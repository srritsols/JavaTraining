package arrays.practice.khushi;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[]args) {
		
	int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   int arra[] = new int[10];     
	 
	   System.out.println("Source Array : "+Arrays.toString(arr));     
	   
	   for(int i=0; i < arr.length; i++) {
	    arra[i] = arr[i];
	}
	   System.out.println("New Array: "+Arrays.toString(arra));
	 }
				
}
	


