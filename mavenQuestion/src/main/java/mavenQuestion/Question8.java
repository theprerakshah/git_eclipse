package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question8
{

	public static void main(String[] args)
	{
		List<String> myList = new ArrayList<String>();
		String[] str = null;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/8/1.txt"));
			String s;
			while((s = br.readLine()) != null)
			{

				str = s.split("\t");
				for(String i : str)
				{
					myList.add(i);
				}
				int tabCount = -1;

				for(int i = 0; i < myList.size(); i++)
				{

					if(myList.get(i).matches("[0-9A-Z]+"))
					{

						tabCount = 0;
						continue;
					}
					else
					{

						for(int j = 0; j < tabCount; j++)
						{
							System.out.print("\t");
						}
						tabCount++;
						System.out.print(myList.get(i));
						System.out.println();

					}
				}
			}

		}

		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}