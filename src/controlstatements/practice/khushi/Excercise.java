package controlstatements.practice.khushi;

import java.util.Scanner;

public class Excercise {
	public static void main(String []args) {
		Scanner a =new Scanner(System.in);
		System.out.println( "Input Number: ");
		int num = a.nextInt();
		
		//It will print multiplication table for the number you enter
		for(int i=0; i<=10;i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
			System.out.println("Expected Output: " + (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
			System.out.println("Specified Output: " + 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
			
			if(num > 0) {
				System.out.println("Number is positive");
			}else if (num < 0) {
				System.out.println("Number is negative");
			}else {
				System.out.println("Number is zero");
			}
		}
}
