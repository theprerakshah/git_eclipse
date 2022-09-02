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
		String[] str = null;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/8/1.txt"));
			String s;
			while((s = br.readLine()) != null)
			{

				String[] temp = s.split("\t", 2);
				String code = temp[0];
				str = temp[1].split("\t");
				for(String i : str)
				{
					myList.add(i);
				}
				int tabCount = 0;
				tempList.addAll(myList);
				//				if(tempList.size() != 0)
				//				{
				//					int tempi = 0;
				//					if(myList.size() > tempList.size())
				//					{
				//
				//						tempi = tempList.size();
				//					}
				//					else
				//					{
				//						tempi = myList.size();
				//					}
				//					for(int i = 0; i < tempi; i++)
				//					{
				//
				//						if(myList.get(i).equals(tempList.get(i)))
				//						{
				//							System.out.println();
				//							myList.remove(i);
				//							//							continue;
				//
				//						}
				//						else
				//						{
				//
				//						}
				//
				//					}
				//					tempList.addAll(myList);
				//				}
				//				else
				//				{
				//					tempList.addAll(myList);
				//
				//				}
				for(int i = 0; i < myList.size(); i++)
				{
					for(int j = 0; j < tabCount; j++)
					{
						System.out.print("\t");
					}
					tabCount++;

					System.out.print(tempList.get(i));
					if(myList.size() - 1 == i)
					{
						System.out.print("~ " + code);

					}
					System.out.println();
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
