package datatypes.practice.srinivas;

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
 
		int num1 = 20;
	     int num2 = 25;
            String a , b  ;
	     double num3 = 5.2;
            boolean r;
            String result ;
        //addition 
		int sum = num1 + num2 ;
		System.out.println(sum);

	//print a sentence 
		a= "hi ";
		b="I am ruchi .";
		result = a + b ;
   	        System.out.println(result);

       //unary operator 
   	System.out.println(num1++);

      //logical 
      // At least one expression needs to be true for result to be true
   	r = (num1 > num2) || (num3 > num1);
   	System.out.println(r);



	}
}


