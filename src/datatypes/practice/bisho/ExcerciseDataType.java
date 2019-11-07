package datatypes.practice.bisho;
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
 
		//TODO you need to create your logic here..
		// items bought
		int bisho= 30;						// int datatype
		int nitesh= 32;						// int datatype
		int average= (bisho+nitesh)/2;  	//average
		int difference= (nitesh-bisho);  	// difference
		int sum= (bisho+nitesh);			// sum
		
		// sum spent
		double bishospent= 30.00;			//double datatype
		double niteshspent= 32.00;			//double datatype
		
		//cost of each product
		int bishocost= (int) (bishospent/bisho);	//Arithmetic operators
		int niteshcost= (int) (niteshspent/nitesh);	//Arithmetic operators
		
		if (bishocost>niteshcost)					//if-else if-else statement
		{
			System.out.println(bishocost);
		}
		else if (niteshcost>bishocost)
		{
			System.out.println(niteshcost);
		}
		else 
		{
			System.out.println("Bought more items" +" "+difference);
		}
		
		// and- if operator 
		System.out.println((nitesh<bisho) && (difference<=2));
		System.out.println((nitesh<bisho) || (difference<=2));
		System.out.println((nitesh>bisho) && (difference<=2));
		System.out.println((nitesh>bisho) || (difference<=2));
		System.out.println((nitesh>bisho) && (difference>=2));
		
		if (nitesh>bisho)
			System.out.println("items bought"+ " "+nitesh);
		else if (nitesh<bisho)
			System.out.println("items bought"+ " "+bisho);
	}
}


