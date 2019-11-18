package arrays.practice.khushi;

public class DuplicateValue {
public static void main(String[]args) {
	int arr[]= {1,2,2,3,4,4,5,6,9,1};
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			//both condition is true it will print duplicate value
			if(arr[i]== arr[j]&& i !=j) {
				System.out.println("duplicate value found: "+ arr[j]);
			}
		}
		
		}
	}
}
//}
	
