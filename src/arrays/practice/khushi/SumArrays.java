package arrays.practice.khushi;

public class SumArrays {
	public static void main (String[]args) {
	int num[][]= {{3,4,5,6,7,8,9},{1,2,3}};
	int sum = 0;

	for(int i:num[0]) {
		sum +=i;
		System.out.println("The sum of arrays is: " + sum);
				
	}
	
	for (int i:num[1]) {
		sum -=i;
		System.out.println("output is: "+ sum);
	}
	
	int result = num[0][1];
	System.out.println("Total array element: "+ result);
	}
	
}
