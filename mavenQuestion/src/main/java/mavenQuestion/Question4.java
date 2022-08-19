package mavenQuestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question4
{
	public static void main(String[] args)
	{
		File[] files = new File("/home/yagneshpancholi/Downloads/Problem_Input/4").listFiles();

		for(File f : files)
		{
			if(f.getName().endsWith(".csv"))
			{
				sumOfCSV(f);
			}
			else if(f.getName().endsWith(".tsv"))
			{
				sumOfTSV(f);
			}
			else
			{
				sumOfTXT(f);
			}
		}

	}

	private static void sumOfTSV(File f)
	{
		int sum = 0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s;
			try
			{
				br.readLine();
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try
			{
				while((s = br.readLine()) != null)
				{
					String[] s3 = s.split("\t");
					sum = sum + Integer.parseInt(s3[4]);
				}
			}
			catch(NumberFormatException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		catch(FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Sum For TSV = ");
		System.out.println(sum);
	}

	private static void sumOfTXT(File f)
	{
		Double sum = 0.0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(f));

			String s;
			try
			{
				br.readLine();
				while((s = br.readLine()) != null)
				{
					String[] s3 = s.split("\t");
					sum = sum + Double.parseDouble((s3[2]));
				}
			}
			catch(NumberFormatException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		catch(FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Sum For TXT = ");
		System.out.println(sum);
	}

	private static void sumOfCSV(File f)
	{
		int sum = 0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s;
			try
			{
				br.readLine();
				while((s = br.readLine()) != null)
				{
					String[] s1 = s.split(",");
					sum = sum + Integer.parseInt(s1[6]);
				}
			}
			catch(NumberFormatException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Sum For CSV = ");
		System.out.println(sum);
	}

}
