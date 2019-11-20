package collections.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8ListExample {

	public static void main(String[] args) {
		 
		Arrays.asList(
				new Staff("John", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)),
				new Staff("lawrence", 33, new BigDecimal(30000))
				);
		
		List<Staff> staff = Arrays.asList(
				new Staff("John", 30, new BigDecimal(10000)),
				new Staff("jack", 27, new BigDecimal(20000)),
				new Staff("lawrence", 33, new BigDecimal(30000))
				);

		// Before Java 5
		Iterator itr=staff.iterator();  
		while(itr.hasNext()){   
			System.out.println(itr.next());  
		}  

		//Before Java 8
		List<String> result = new ArrayList<>();
		for (Staff x : staff) {
			result.add(x.getName());
		}
		System.out.println(result); 


		//Java 8
		List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(collect.toString());   

	}  
}
