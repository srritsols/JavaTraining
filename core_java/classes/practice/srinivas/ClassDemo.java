package classes.practice.srinivas;

public class ClassDemo{

	/**
	 * Please try to follow and create the following:
	 * 
	 *  1. Create simple class with few variables
	 *  2. Create few methods for class behavior 
	 *  3. create a main method and object for newly created.
	 *  4. Try to call different methods with multiple objects.
	 *  
	 */

	

		  boolean isOn;
		  void turnOn() {
		    isOn = true;
		  }
		  void turnOff() {
		   isOn = false;
		  }
		  
		  void displayLightStatus() {
		     
		     System.out.println("Light on? " + isOn);
		  }
		}
		class ClassObjectsExample {
		public static void main(String[] args) {
		   
		   ClassDemo l1 = new ClassDemo(), l2 = new ClassDemo();
		   
		   l1.turnOn();
		   l2.turnOff();
		   
		   l1.displayLightStatus();
		   l2.displayLightStatus();
		  }
		}