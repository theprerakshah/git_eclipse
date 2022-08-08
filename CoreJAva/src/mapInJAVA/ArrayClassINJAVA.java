package mapInJAVA;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ArrayClassINJAVA {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 8, 5, 6, 4 };
//		Arrays.sort(arr);
//		for (int i : arr) {
//			System.out.println(i);
//		}
//
//		int i = Arrays.binarySearch(arr, 4);
//		System.out.println(i);
//		
		//collection class
		
//		Set<Integer> arr = new HashSet<>();
//		arr.add(2);
//		arr.add(5);
//		arr.add(6);
//		arr.add(3);
//		arr.add(98);
//		arr.add(98);
//		arr.add(3);
//		System.out.println(arr.size());
//		System.out.println(Collections.min(arr));
//		Collections.sort(arr);
		
//		Set<Integer> a = new HashSet<>();
//		Set<Integer> b = new HashSet<>();
//		a.add(5);
//		a.add(10);
//		a.add(15);
//		a.add(5);
//		
//		b.add(10);
//		b.add(15);
//		b.add(4);
//		b.add(5);
//		a.addAll(b);
//		System.out.println(a.size());
		
//		System.out.println(Pattern.matches("[A-Za-z0-9.-]+@[a-zA-Z-]+\\.[a-zA-Z]{3}", "[pancholiyagnesh2001@gmail.com"));
		

	
		   
		        final String regex = "[A-Za-z0-9.-]+@[a-zA-Z-]+\\.[a-zA-Z]{3}";
		        final String string = "pancholiyagnesh2001@gmail.com\n"
			 + "pancholiyagu@gmail.com\n"
			 + "CoreyMSchafer@gmail.com\n"
			 + "corey.schafer@university.edu\n"
			 + "corey-321-schafer@my-word.net";
		        
		        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		        final Matcher matcher = pattern.matcher(string);
		        
		        while (matcher.find()) {
		            System.out.println("Full match: " + matcher.group(0));
		            
		            for (int i = 1; i <= matcher.groupCount(); i++) {
		                System.out.println("Group " + i + ": " + matcher.group(i));
		            }
		        }
		    }
		

		
	}


