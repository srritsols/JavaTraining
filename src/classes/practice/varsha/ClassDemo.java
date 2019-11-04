package classes.practice.varsha;

public class ClassDemo {

	/**
	 * Please try to follow and create the following:
	 * 
	 *  1. Create simple class with few variables
	 *  2. Create few methods for class behavior 
	 *  3. create a main method and object for newly created.
	 *  4. Try to call differenet methods with multiple objects.
	 *  
	 */

	int ReleaseYear;
	
	public ClassDemo(String brand) {
		System.out.println("Brand name is :" + brand);
		}
	
	public void setYear(int year) {
		ReleaseYear=year;
	}
	
	public int getYear() {
		System.out.println("Car release year is:" + ReleaseYear);
		return ReleaseYear;
	}
	public static void main( String[] args ){  
 
	//object creation
		ClassDemo myCar = new ClassDemo("Jaguar");
		
		//Calling Class method to setRelease year
		myCar.setYear(2016);
		
		//calling class method to give Release year
		myCar.getYear();
	
	}
}


