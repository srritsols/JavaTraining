package arrays.practice.khushi;

import java.util.Arrays;

public class SortingArrays {
	public static void main(String[]args) {
		int numbers[] = {123,456,789,112,132,456};
		String name[]= {"joe","leo","ryan","yosmi","shaun","joy"};
		
		System.out.println("Original num: " +Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("After sorting num: "+ Arrays.toString(numbers));
		
		System.out.println("Original num:" +Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("After sorting name: "+Arrays.toString(name));
}
}
