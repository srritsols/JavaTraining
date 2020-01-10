package practice.nitesh;

import java.util.Scanner;

public class SalesTax {
	

	public static void main(String[] args) {
		System.out.println("Please enter the price: ");
Scanner input = new Scanner(System.in);
double purchase = input.nextDouble();
System.out.println("The tax rate of the NewYork is:  8.25%" );
double totalPurchases = purchase + purchase * 8.25/100;
System.out.println("The total purchase is: " + totalPurchases);

	}

}
