package arrays.practice.khushi;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[]args) {
		
	int[] array1 = {19,89,20,23,27,92,88,33,90};
  System.out.println("Original array : "+Arrays.toString(array1));
  
   for(int i = 0; i < array1.length / 2; i++)
  {
    int temp = array1[i];
    array1[i] = array1[array1.length - i - 1];
   array1[array1.length - i - 1] = temp;
  }
    System.out.println("Reverse array : "+Arrays.toString(array1));
 }
}


