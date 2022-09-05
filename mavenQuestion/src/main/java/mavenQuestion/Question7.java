package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question7
{

	public static void main(String[] args)
	{
		List<String> mylist = new ArrayList<String>();
		List<String> templist = new ArrayList<String>();

		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/7/InputFile"));

			String s;

			while((s = br.readLine()) != null)
			{
				String s1 = s.split("@@")[0];
				mylist.add(s1);
			}
			for(int i = 0; i < mylist.size(); i++)
			{
				String regex = "\\~ (?<val>[A-Za-z0-9\\, ]*)";
				String test = mylist.get(i);

				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(test);

				if(matcher.find())
				{
					System.out.print(matcher.group("val") + "  ");
					templist.add(test.split("\\~ (?<val>[A-Za-z0-9]*)")[0]);

					for(String s1 : templist)
					{
						System.out.print(s1.trim() + "\t");
					}
					//System.out.println(test.split("\\~ (?<val>[A-Za-z0-9]*)")[0]);
					try
					{
						int n = countTabs(mylist.get(i + 1));
						int n1 = countTabs(mylist.get(i));
						for(int j = templist.size(); j > n; j--)
						{
							templist.remove(j - 1);
						}
						System.out.println();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}

				}
				else
				{
					if(countTabs(test) == 0)
					{
						if(templist.size() == 0)
						{
							templist.add(test);
						}
						else
						{
							templist.set(0, test);
						}
					}
					else
					{
						templist.add(test);
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

	private static int countTabs(String s1)
	{
		// TODO Auto-generated method stub
		String regex = "\\t";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s1);
		int c = 0;
		while(matcher.find())
		{
			c++;
		}
		return c;
	}

}
