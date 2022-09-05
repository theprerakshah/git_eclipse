package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Question8
{
	public static void main(String[] args)
	{
		ArrayList<String> myList = new ArrayList<String>();
		ArrayList<String> tempList = new ArrayList<String>();
		ArrayList<String> ansList = new ArrayList<String>();
		ArrayList<String> ans2List = new ArrayList<String>();

		String[] str = null;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/8/InputFile"));
			String s;

			while((s = br.readLine()) != null)
			{
				boolean myBoolean2 = false;
				String[] temp = s.split("\t", 2);
				String code = temp[0];
				str = temp[1].split("\t");
				for(String i : str)
				{
					myList.add(i);
				}

				int tabCount = 0;
				if(tempList.size() == 0)
				{
					for(int m = 0; m < 6; m++)
					{
						tempList.add("A");
					}
					ansList.addAll(myList);
				}
				else
				{
					ansList.clear();
					ansList.addAll(ans2List);
					tempList.clear();
					tempList.addAll(ansList);
					tempList.add("");
					tempList.add("");
				}
				ans2List.clear();
				ans2List.addAll(myList);
				boolean myBoolean = false;
				for(int i = 0; i < myList.size(); i++)
				{
					if(!myList.get(i).equals(tempList.get(i)))
					{
						for(int j = 0; j < tabCount; j++)
						{
							System.out.print("\t");

						}
					}

					tabCount++;
					try
					{
						if(myBoolean2)
						{
							//							for(int j = 1; j < tabCount - 1; j++)
							//							{
							//								System.out.print("\t");
							//
							//							}
							System.out.print(myList.get(i));
						}
						else
						{
							if(!myList.get(i).equals(tempList.get(i)))
							{
								System.out.print(myList.get(i));
								myBoolean = true;
								myBoolean2 = true;

							}
						}

					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					if(myList.size() - 1 == i)
					{
						System.out.print("~ " + code);

					}
					if(myBoolean)
					{
						System.out.println();

					}
				}
				myList.clear();

			}
			br.close();
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
