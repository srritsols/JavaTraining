package practice.nitesh;

import java.util.Scanner;

public class ConvertIntoInches {

	public static void main(String[] args) {
		System.out.println("Please enter the inches you want to convert:");
Scanner input = new Scanner(System.in);
double centimeter = input.nextDouble();
System.out.println("The " + centimeter + " inches into centimeter is " + (centimeter / 2.54) + "cm");
	}

}
