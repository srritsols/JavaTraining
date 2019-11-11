package datatypes.practice.bisho;
/**
 * This data type program you need to create the following:
 * 
 *  1. Create at least three identifiers
 *  2. Create few variables using different data types
 *  3. Add few arithmetic operations
 *  4. Add few logical operators 	 
 *  
 */

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 2;							
		int b= 4;
		String c= "Hi";
		String d= "Bisho";
		double e= 25.00;
		
		int f= (a+b);
		System.out.println("Total number of items bought"+ " "+ f);
		
		double g= (int) f* e; 
		System.out.println("Total cost"+ " "+ g);
		
		if (f!= 160)
		System.out.println ("Total cost paid" + " " +g);
		
		// and- or operator 
		System.out.println((a<b) && (g<=150.0));
		 System.out.println((a>b) && (g>=150.0));
		 System.out.println((a<b) || (g>=150.0));
		 System.out.println((a>b) || (g<=150.0));
				

	}

}
