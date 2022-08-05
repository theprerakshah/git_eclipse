package mapInJAVA;

import java.util.ArrayList;
import java.util.*;

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
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(5);
		
		b.add(10);
		b.add(15);
		b.add(4);
		b.add(5);
		a.addAll(b);
		System.out.println(a.size());
		
	}

}
