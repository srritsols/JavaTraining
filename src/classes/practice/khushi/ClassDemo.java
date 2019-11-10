package classes.practice.khushi;

public class ClassDemo {

	private String name;
	private int year;
	private int marks;

	/**
	 * Please try to follow and create the following:
	 * 
	 *  1. Create simple class with few variables
	 *  2. Create few methods for class behavior 
	 *  3. create a main method and object for newly created.
	 *  4. Try to call different methods with multiple objects.
	 *  
	 */
	
	public ClassDemo() {
		name = "khushbu";
		year = 3;
		marks = 90;
	}
	
	public ClassDemo (String name,int year,int marks) {
		this.name = name;
		this.year = year;
		this.marks = marks;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}
	public int getMarks() {
		return marks;
	}
	
	public static void main( String[] args ){  
		ClassDemo myProfile = new ClassDemo();
		
		myProfile.getName();
		myProfile.getYear();
		myProfile.getMarks();
	}
}



