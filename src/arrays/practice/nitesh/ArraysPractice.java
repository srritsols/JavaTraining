package arrays.practice.nitesh;

import java.util.Arrays;
import java.util.Collections;

public class ArraysPractice {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[]{2,4,6,8,10};
	// checking the validation of the integer
		
		
		if (intArray.length <=0 ) {
			System.out.println("There are no any elements in the arrays.");
			
		}
		System.out.println("Length of the arrays is: " + intArray.length);
//saw a good example online using collections.
		
		
Arrays.sort(intArray, Collections.reverseOrder());
for(int i = 0; i < intArray.length; i ++) {
System.out.print(intArray[i]+";");
		
}

	}

}
