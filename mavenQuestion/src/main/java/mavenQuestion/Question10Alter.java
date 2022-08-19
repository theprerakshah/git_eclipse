package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question10Alter
{

	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/10/Equations"));
			String s;
			int i = 1;
			while((s = br.readLine()) != null)
			{
				System.out.println("Equation : " + i);
				generateAns(generateStringArray(s), s);
				i++;

			}

		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String[] generateStringArray(String s)
	{
		String str = s.split("=")[0];

		String[] s1 = str.split("\\+");
		return s1;

	}

	private static void generateAns(String[] s1, String s)

	{
		Map<String, ArrayList<String>> myMap = new TreeMap<>();

		for(String i : s1)
		{
			String regex = "(?<val>[A-Z0-9a-z]*)\\.\\*";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(i);
			if(matcher.find())
			{
				ArrayList<String> mylist = generateList(matcher.group("val"));
				if(!myMap.containsKey(matcher.group("val")))
				{
					myMap.put(matcher.group("val"), mylist);
				}
			}

		}

		for(Map.Entry<String, ArrayList<String>> entry : myMap.entrySet())
		{
			int temp = entry.getValue().size();
			ArrayList<String> temp2 = entry.getValue();
			for(int k = 0; k < temp; k++)
			{
				String t1 = temp2.get(k);
				if(myMap.keySet().size() > 1)
				{
					String temp1 = s;
					System.out.println(s.replaceFirst(entry.getKey(), t1));

				}
				else
				{

					//System.out.println(s.replaceAll("([A-Z0-9a-z]*)\\.\\*", t1));

				}

			}

		}

	}

	public static ArrayList<String> generateList(String s)
	{
		ArrayList<String> ansList = new ArrayList<String>();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/10/LatestIcd10Codes"));
			String sLine;

			while((sLine = br.readLine()) != null)
			{
				String regex = s;
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(sLine);

				while(matcher.find())
				{
					ansList.add(sLine);
				}
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return ansList;
	}

}
