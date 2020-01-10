package practice.nitesh;

import java.util.Scanner;

public class PaymentDueAccordingTolaborRequirementWithWarning {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Please enter the hours worked by you: ");
double hours = input.nextDouble();
System.out.println("Please enter your base pay rate");

double basePayRate = input.nextDouble();
if(basePayRate < 5.15) {
	System.out.println("The pay rate you entered is low comparing to the minimum rate by the state. \n");
}
if(hours <= 40) {
double payAmount = hours * basePayRate;
System.out.println("The total pay amount is: $" + payAmount);
}else {
	if(hours > 40) {
		System.out.println("The hour you entered is" + hours+ "which is " + (hours - 40) + " more than 40.0 hours. So, you will get times and a half for extra hours\n");
		double extraHours = hours - 40;
		double payAmount = hours * basePayRate + extraHours * (basePayRate * 1.5);
		System.out.println("The total pay amount is: $" + payAmount);
	}
}

	}

}
