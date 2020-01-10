package practice.nitesh;

import java.util.Scanner;

public class PaymentDue {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Please enter the hours worked by you: ");
double hours = input.nextDouble();
System.out.println("Please enter your base pay rate");
double basePayRate = input.nextDouble();

double payAmount = hours * basePayRate;

System.out.println("The total pay amount is: $" + payAmount);
	}

}
