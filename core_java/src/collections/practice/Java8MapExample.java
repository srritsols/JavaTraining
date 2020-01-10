package collections.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8MapExample {

	public static void main(String[] args) {

		Map<Integer, String> staff = new HashMap<>();
		
		staff.put(1, "John");
		staff.put(2, "Victor"); 
		staff.put(3, "David"); 

		// Before Java 5
		Set set=staff.entrySet();  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){     
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" "+entry.getValue());  
		}  
		
		// Before Java 8
		String result = "";
		for (Map.Entry<Integer, String> entry : staff.entrySet()) {
			if ("Victor".equals(entry.getValue())) {
				result = entry.getValue();
			}
		}
		System.out.println("Before Java 8 : " + result);

		//Map -> Stream -> Filter -> String
		result = staff.entrySet().stream()
				.filter(map -> "Victor".equals(map.getValue()))
				.map(map -> map.getValue())
				.collect(Collectors.joining());

		System.out.println("With Java 8 : " + result); 
	}
}