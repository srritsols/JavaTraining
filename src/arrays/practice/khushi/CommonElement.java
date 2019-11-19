package arrays.practice.khushi;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElement {
	public static void main(String[]args) {
		String cars1[]= {"Honda","lexus","ferrari","hyundi","Rangerover"};
		String cars2[]= {"BMW","mercedez","tesla","camry","ferrari"};
		
		System.out.println("Cars 1: "+Arrays.toString(cars1));
		System.out.println("Cars 2: "+Arrays.toString(cars2));
		
		HashSet<String> set =new HashSet<String>();
		
		for(int i=0;i<cars1.length;i++) {
			for(int j=0;j<cars2.length;j++) {
				if(cars1[i].equals(cars2[j])) {
					set.add(cars1[i]);
				}
			}
		}
		System.out.println("Common Element:" +set);
	}

}
