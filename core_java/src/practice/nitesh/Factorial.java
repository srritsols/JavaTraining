package practice.nitesh;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Please enter the number you want to have the factorial.");
Scanner input = new Scanner(System.in);
int temp = input.nextInt();
int factorial = 1;
for(int i = 1; i <=temp; i++) {
	factorial *= i;
	
}
System.out.println("The factorial of the number provided by the user is: " + factorial);
	}

}
