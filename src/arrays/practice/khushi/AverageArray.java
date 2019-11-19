package arrays.practice.khushi;

public class AverageArray {
	public static void main(String[]args) {
		int num1[]= {3,42,5,6,8};
		int sum = 0;
		for(int i:num1) {
			sum +=i;
			System.out.println("Sum of element is: "+ sum);
			
		}
		double average =(double)sum/num1.length;
		System.out.println("Average of element is: "+ average);
		
		
		
		
	}

}
