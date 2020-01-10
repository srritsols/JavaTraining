package arrays.practice.nitesh;

public class SumOfElements {

	public static void main(String[] args) {
int nums[] = {12, 13, 24, 35, 78, 99};
int sum = 0;
for(int i = 0; i < nums.length; i++) {
	sum += nums[i];
	
}
System.out.println("Sum of the arrays of numbers are: " + sum);
	
for(int num: nums) {
	sum += num;
	
}
System.out.println("Sum of the arrays of numbers are: " + sum/2);
	}
	

}
