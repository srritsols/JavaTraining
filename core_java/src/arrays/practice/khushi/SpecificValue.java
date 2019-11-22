package arrays.practice.khushi;

public class SpecificValue {
	public static void main(String[]args) {
		int[]arr1 = {1,2,3,4,5,6};
		 System.out.println(contains(arr1,5));
		 System.out.println(contains(arr1,9));
	}
		 static boolean contains(int[]arr, int item) {
			for(int n:arr) {
				if(item ==n) {
					return true;
				}
			}
			return false;
			
		}
	}

