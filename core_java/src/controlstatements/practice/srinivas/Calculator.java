package controlstatements.practice.srinivas;
import java.util.Scanner;


public class Calculator {

	
	public static void main(String[] args) { 
		double num1, num2;
        Scanner scanner = new Scanner(System.in); //scanner is used to take input from user found in utils.java package 
        System.out.print("Enter first number:");

      
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            
            default:
                System.out.printf("wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }

	}

