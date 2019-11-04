
package datatypes.practice.khushi;

public class ExcerciseDataType {

	/**
	 * This data type program you need to create the following:
	 * 
	 *  1. Create at least three identifiers
	 *  2. Create few variables using different data types
	 *  3. Add few arithmetic operations
	 *  4. Add few logical operators 	 
	 *  
	 */

	public static void main( String[] args ){ 
		/*
		 * This method will show whether the student pass the class or no.
		 * 
		 */
 
		//TODO you need to create your logic here..
		String studentName = "Khushbu";
		int subject1 =80;
		int subject2 = 30;
		int average = (subject1+subject2)/2;
		
		System.out.println(studentName);
		
		//This will printout the average of two subjects
		System.out.println("Your Average is: " + average);
		
		// The if condition will check whether the student average is above 35 or no.
		if(average > 35) {
			//Average is above 35 than it print the output.
		System.out.println("Congrats! You are Pass");
		}
		
		// Average is not more than 35 than it will print the output.
		else {
			System.out.println("Sorry! You are fail");
		
	}   // This && operator will check whether both condition is true or no. If its true it will printout true or vice versa
		System.out.println((subject1 > 35) && (subject2 < 35));
		// This || operator will check whether one of the condition is true or not if yes than it print out true or vice versa
		System.out.println((subject1 > 35) || (subject2 > 35));

	}
}


