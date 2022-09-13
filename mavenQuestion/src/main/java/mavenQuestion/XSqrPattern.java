package mavenQuestion;

import java.util.Scanner;

public class XSqrPattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 != 0)
		{
			for(int i = 1; i <= n; i++)
			{
				for(int j = 1; j <= n; j++)
				{
					if(i == 1 || i == n)
					{

						System.out.print("*");

						//System.out.println();
					}
					else if(i == n / 2 + 1)
					{

						if(j == 1 || j == n || j == n / 2 + 1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}

					}
					else
					{

						if(j == 1 || j == n || j == i || j == n - i + 1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}

				}
				System.out.println();
			}

		}
		else
		{

			for(int i = 1; i <= n; i++)
			{
				for(int j = 1; j <= n; j++)
				{
					if(i == 1 || i == n)
					{

						System.out.print("*");

						//System.out.println();
					}
					else if(i == n / 2 + 1 || i == n / 2)
					{

						if(j == 1 || j == n || j == n / 2 + 1 || j == n / 2)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}

					}
					else
					{

						if(j == 1 || j == n || j == i || j == n - i + 1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}

				}
				System.out.println();
			}

		}

		sc.close();
	}

}