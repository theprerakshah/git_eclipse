package mavenQuestion;

import java.util.Scanner;

public class TempCC
{

	public static void main(String[] args)
	{
		/* package codechef; // don't place package name! */

		/* Name of the class has to be "Main" only if the class is public. */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			// your code goes here
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((a + b + c) == 180)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("No");
			}
		}

		//		Scanner sc = new Scanner(System.in);
		//		int n = sc.nextInt();
		//		int m = sc.nextInt();
		//		int n1 = (int) Math.ceil(n / 10);
		//		int m1 = (int) Math.ceil(m / 10);
		//		int ans = Math.abs(n1 - m1);
		//		System.out.println(ans);
		//		float f = n / 10;
		//		System.out.println(f);
		//		Scanner sc = new Scanner(System.in);
		//		int t = sc.nextInt();
		//		while(t-- > 0)
		//		{
		//			// your code goes here
		//			int a = sc.nextInt();
		//			int b = sc.nextInt();
		//			int c = sc.nextInt();
		//			int d;
		//			
		//			if(d >= a)
		//			{
		//				System.out.println("Qualify");
		//			}
		//			else
		//			{
		//				System.out.println("notqualify");
		//			}
		//		}
		//
	}

}
