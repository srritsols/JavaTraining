package practice.nitesh;

import java.util.Scanner;

public class ConvertIntoCentimeter {

	public static void main(String[] args) {
		System.out.println("Please enter the inches you want to convert:");
Scanner input = new Scanner(System.in);
double inches = input.nextDouble();
System.out.println("The " + inches + " inches into centimeter is " + (inches * 2.54));
	}

}
