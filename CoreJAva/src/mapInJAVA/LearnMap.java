package mapInJAVA;

import java.util.*;

public class LearnMap {

	public static void main(String[] args) {
		//keys unique key-value pair
		//TreeMap sort on basis of key
		Map<String , Integer> numbers = new HashMap<>();
		numbers.put("Yagnesh", 1);
		numbers.put("Pancholi", 2);
		numbers.put("Dineshkumar", 3);
		System.out.println(numbers);
		numbers.putIfAbsent("Yagnesh", 5);
		for(Map.Entry<String, Integer> e: numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
	}

}
