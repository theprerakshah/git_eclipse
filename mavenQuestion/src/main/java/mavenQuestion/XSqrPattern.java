
package mavenQuestion;
//

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class XSqrPattern
{
	public static void main(String[] args)
	{
		String a = "abcd";
		System.out.println(a.charAt(3));
		//		chef();
		//		System.out.println(Integer.MIN_VALUE);
		//		int a, b = 0;
		//		Map<Integer, Integer> myMap = new HashMap<>();
		//		myMap.values();
		//		//		for(String string : args)
		//		//		{
		//		//
		//		//		}
		//		//		myMap.put(key, value)
		//		Scanner sc = new Scanner(System.in);
		//		int n = sc.nextInt();
		//		if(n % 2 != 0)
		//		{
		//			for(int i = 1; i <= n; i++)
		//			{
		//				for(int j = 1; j <= n; j++)
		//				{
		//					if(i == 1 || i == n)
		//					{
		//
		//						System.out.print("*");
		//
		//						//System.out.println();
		//					}
		//					else if(i == n / 2 + 1)
		//					{
		//
		//						if(j == 1 || j == n || j == n / 2 + 1)
		//						{
		//							System.out.print("*");
		//						}
		//						else
		//						{
		//							System.out.print(" ");
		//						}
		//
		//					}
		//					else
		//					{
		//
		//						if(j == 1 || j == n || j == i || j == n - i + 1)
		//						{
		//							System.out.print("*");
		//						}
		//						else
		//						{
		//							System.out.print(" ");
		//						}
		//					}
		//
		//				}
		//				System.out.println();
		//			}
		//
		//		}
		//		else
		//		{
		//
		//			for(int i = 1; i <= n; i++)
		//			{
		//				for(int j = 1; j <= n; j++)
		//				{
		//					if(i == 1 || i == n)
		//					{
		//
		//						System.out.print("*");
		//
		//						//System.out.println();
		//					}
		//					else if(i == n / 2 + 1 || i == n / 2)
		//					{
		//
		//						if(j == 1 || j == n || j == n / 2 + 1 || j == n / 2)
		//						{
		//							System.out.print("*");
		//						}
		//						else
		//						{
		//							System.out.print(" ");
		//						}
		//
		//					}
		//					else
		//					{
		//
		//						if(j == 1 || j == n || j == i || j == n - i + 1)
		//						{
		//							System.out.print("*");
		//						}
		//						else
		//						{
		//							System.out.print(" ");
		//						}
		//					}
		//
		//				}
		//				System.out.println();
		//			}
		//
		//		}
		//
		//		sc.close();
	}

	public static void chef()
	{
		/* package codechef; // don't place package name! */

		/* Name of the class has to be "Main" only if the class is public. */

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0)
		{
			// your code goes here
			Map<Integer, Integer> myMap = new HashMap<>();
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++)
			{

				arr[i] = sc.nextInt();

			}
			Arrays.sort(arr);

			for(int i = 0; i < n; i++)
			{
				int count = 0;
				for(int j = 0; j < n; j++)
				{
					if(arr[j] == arr[i])
					{
						count++;
					}
				}
				myMap.put(arr[i], count);
			}
			if(myMap.size() == arr.length)
			{
				System.out.println(arr.length - 1);
			}
			else
			{
				int max = 0;
				for(int i : myMap.values())
				{
					if(i > max)
					{
						max = i;
					}
					//if(i == arr.length){
					//    System.out.println("0");
					//}
				}
				System.out.println(arr.length - max);
			}

			//  for(int i = 0 ; i < n;i++){
			//      System.out.println(arr[i]);
			// }
			// System.out.println(count);

		}

	}
}
