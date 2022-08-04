package mapInJAVA;

import java.util.Arrays;

public class ArrayClassINJAVA {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 8, 5, 6, 4 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

		int i = Arrays.binarySearch(arr, 4);
		System.out.println(i);
		

	}

}
