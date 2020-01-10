package practice.nitesh;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight in grams");
		double grams = input.nextDouble();

		System.out.println("Enter the weight in pounds.");
		double pounds = input.nextDouble();

		System.out.println("Conversion begins here");
		System.out.println("----------------------------------------------");
		System.out.println("Conversion of grams into pounds and kilograms.");
		System.out.println(grams + " grams into pounds is " + (grams / 454) + "lb");
		System.out.println(grams + " grams into kilograms is " + (grams / 1000) + "kg");
		System.out.println("----------------------------------------------");
		System.out.println("Conversion of pounds into grams and kilograms.");
		System.out.println(pounds + " lb into grams is " + (pounds * 454) + "gm");
		System.out.println(pounds + " lb into kilograms is " + (pounds * 454 / 1000) + "kg");
	}

}
