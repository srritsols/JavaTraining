package arrays.practice.khushi;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String[]args) {
	   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   
	   System.out.println("Original Array : "+Arrays.toString(array));     
	   
	   int removeIndex = 1;

	   for(int i = removeIndex; i < array.length -1; i++){
	       array[i] = array[i + 1];
	      }
	    System.out.println("After removing the second element: "+Arrays.toString(array));
	 }
	 }
	


