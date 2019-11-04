package classes.practice.preethi;
import java.util.Scanner;
public class ClassDemo {

	/**
	 * Please try to follow and create the following:
	 * 
	 *  1. Create simple class with few variables
	 *  2. Create few methods for class behavior 
	 *  3. create a main method and object for newly created.
	 *  4. Try to call different methods with multiple objects.
	 *  
	 */ 
	 public void fullThrottle()
	 {
	 System.out.println("The car is going as fast as it can"); 
	 }
	 public void speed(int maxSpeed) {
		    System.out.println("Maximum speed is: " + maxSpeed);
		  }
	 public int convert(int maxSpeed) {
		 int vel=0;
		 vel= (maxSpeed*18)/5;
		 return vel;
	 }
     
	public static void main( String[] args ){  
 
		//TODO you need to create your logic here..
		ClassDemo myCar = new ClassDemo();            
	    int vel=0,maxSpeed=0;
	    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the maximum speed");
        maxSpeed=scanner.nextInt();
        myCar.fullThrottle();     
        myCar.speed(maxSpeed);
	    vel=myCar.convert(maxSpeed);
	    System.out.println("The speed in km/hr is " + vel);
		scanner.close();

	}
}


