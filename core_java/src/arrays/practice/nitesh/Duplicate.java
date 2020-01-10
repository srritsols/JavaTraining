package arrays.practice.nitesh;

public class Duplicate {

	public static void main(String[] args) {
int nums[] = {12, 23, 13, 24, 35, 78, 12, 24};

for (int i = 0; i < nums.length; i++) {
	for (int j = i+1; j < nums.length; j++) {
		if(nums[i] == nums[j]) {
			System.out.println("Duplicate values are: " + nums[j]);
		}
	}
}
	}

}
