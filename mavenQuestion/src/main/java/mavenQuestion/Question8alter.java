package mavenQuestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Question8alter
{
	static LinkedList<String> list = new LinkedList<String>();

	public static void addToList(String dis, int index)
	{
		if(list.isEmpty())
		{
			list.add(dis);
			addTab(0);
			System.out.println(dis);
		}
		else
		{
			if(index < list.size())
			{
				if(!dis.equals(list.get(index)))
				{
					list = newlist(index);
					list.add(dis);
					addTab(index);
					System.out.println(dis);
				}
			}
			else
			{
				list.add(dis);
				addTab(index);

				System.out.println(dis);
			}
		}

	}

	public static void addLastToList(String dis, int index)
	{
		if(list.isEmpty())
		{
			list.add(dis);
			addTab(0);
			System.out.print(dis);
		}
		else
		{
			if(index < list.size())
			{
				if(!dis.equals(list.get(index)))
				{
					list = newlist(index);
					list.add(dis);
					addTab(index);
					System.out.print(dis);
				}
				else
				{
					addTab(index);
					System.out.print(dis);
				}
			}
			else
			{
				list.add(dis);
				addTab(index);
				System.out.print(dis);
			}
		}

	}

	public static LinkedList<String> newlist(int index)
	{
		LinkedList<String> newList = new LinkedList<String>();
		for(int i = 0; i < index; i++)
		{
			newList.add(list.get(i));
		}
		return newList;
	}

	public static void addTab(int tabs)
	{
		for(int i = 0; i < tabs; i++)
		{
			System.out.print("\t");
		}

	}

	public static void main(String[] args) throws FileNotFoundException
	{

		File file = new File("/home/yagneshpancholi/Downloads/Problem_Input/8/InputFile");
		Scanner sc = new Scanner(file);

		while(sc.hasNext())
		{
			String[] line = sc.nextLine().split("\t", 2);
			String code = line[0];
			String[] dis = line[1].split("\t");
			int flag = 0;

			if(list.size() == dis.length)
			{
				int c = 0;
				for(int i = 0; i < dis.length; i++)
				{
					if(list.get(i).equals(dis[i]))
					{
						c++;
					}
					if(c == dis.length)
					{
						flag = 1;

					}

				}
			}
			if(flag == 1)
			{
				System.out.print("," + code);
				continue;
			}
			System.out.println();
			for(int i = 0; i < dis.length - 1; i++)
			{
				addToList(dis[i], i);
			}
			addLastToList(dis[dis.length - 1], dis.length - 1);
			System.out.print(" ~ " + code);
		}
		sc.close();
	}

}
