package arrays.practice.nitesh;

public class MiddleNumber {

	public static void main(String[] args) {
int nums[] = {12, 23, 13, 24, 35, 78, 12, 24, 9};
int number = nums.length/2;
for (int i = 0; i < nums.length; i++) {
	System.out.println("The elements in the given arrays are " + nums[i]);
}
System.out.println("The middle element of the given arrays is"  + nums[number]);
	}

	

}
