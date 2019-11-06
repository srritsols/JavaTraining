package controlstatements.practice.khushi;

public class ControlStatement {
	
	/**
	 * Please try to follow and create the following:
	 * 
	 *  1. Create multiple if-else-if statements
	 *  2. Create for, while and do-while loops
	 *  3. Create a method to use switch, case, break, continue statement. 
	 *  4. Add few arithmetic operations
	 *  5. Add few logical operators 	 
	 *  
	 */
	 
	public static void main(String[] args) { 
		//if else if statement code block
		//logical operator
		String studentNames []= {"lee","shasha","jack","Mike"};
		int marks = 90;
		
		if(marks > 90) {
			System.out.println("Congratulation! Excellent Work");
		}else if(marks !=0 && marks < 30) {
				System.out.println("Bad luck");
		}else if(marks > 40 && marks <50) {
			System.out.println("you need to work hard");
		}else if(marks >50 && marks<80) {
			System.out.println("Very Good!");
		}else {
			System.out.println("Extremly Sorry");
		}
		
		//loop code block to count number of students
		for (int i=0;i<studentNames.length;i++) {
			System.out.print("Total " + studentNames.length +"  " + "students are there!");
			break;
			}
		
		//while and do while loop
		//do while loop will be infinite if true
		
		while(marks == 90) {
			System.out.println("Great Work!");
			break;
		}
		
		do {
			System.out.println("Need More efforts!");
		}
			while (marks <= 30);
	}
	
	//switch statement code block
	//not able to execute
	{
	int marks = 90;
	String grade; 
	
	switch (marks) {
	case 90:
		grade ="Got A grade";
		break;
	case 80:
		grade ="Got B grade";
		break;
	case 70:
		grade ="Got C grade";
		break;
	default:
		grade ="failed";
	}
	System.out.println(grade);
		
	} 
	
	
}
		


