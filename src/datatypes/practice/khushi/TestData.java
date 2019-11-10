package datatypes.practice.khushi;

import java.util.Scanner;

public class TestData {
	public static void main (String [] args) {	
		//testing the data
		System.out.println((-5 + 8 * 6 ));
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3*5 /8);
		System.out.println(5 + 15/3 *2 -8 %3);
		
		//Multiply two number
		int firstNumber = 25;
		int secondNumber =5;
		int temp;
		System.out.println("The product of first and second number is : " + firstNumber * secondNumber);
		
		//Input the first and second number and get the product of two
		Scanner in = new Scanner(System.in);
		//Ask user to enter number
		System.out.println("Input first Number: ");
		int num1 = in.nextInt();
		//ask user to enter another number
		System.out.println("Input second Number: ");
		int num2 = in.nextInt();
		//give output
		System.out.println("Expected Output: "+ num1 + "x" + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 /num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1  % num2));
		
		//Swapping variable
		System.out.println("Before swapping : firstNumber,secondNumber = " + firstNumber + "," + secondNumber);
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = firstNumber;
		System.out.println("After Swapping : firstNumber, secondNumber = " + + firstNumber +"," + secondNumber);


  }
}

