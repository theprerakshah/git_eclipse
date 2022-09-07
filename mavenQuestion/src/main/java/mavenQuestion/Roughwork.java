package mavenQuestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Roughwork
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("/home/yagneshpancholi/Downloads/Problem_Input/8/InputFile");
		Scanner sc = new Scanner(file);
		List<String> rows = new ArrayList<>();
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			ArrayList<String> list = new ArrayList<String>();

			String[] a = line.split("\\t");
			for(int i = 0; i < a.length; i++)
			{
				String d = a[i];
				d = d.replace(",", "-");
				list.add(d);
			}
			String code = list.get(0);
			list.remove(0);
			//for(int i=0; i<a.length;i++)
			//{list.add(a[i]);}
			rows.add(list.toString().replace("[", "").replace("]", "").replace(",", "\t") + "~" + code);
		}

		sc.close();
		Linked root = new Linked();
		for(String row : rows)
		{
			Linked parent = root;
			String[] cells = row.split("\\t");
			for(String cell : cells)
			{
				Linked child = (Linked) parent.get(cell);
				if(child == null)
				{
					parent.put(cell, child = new Linked());
				}
				parent = child;
			}
		}

		print(root, "", "\t");
	}

	static void print(Linked m, String indentationStr, String indentationStrAddition)
	{
		String Key = "";
		String s = "";
		ArrayList<String> lines = new ArrayList<String>();

		for(Entry<String, Linked> o : m.entrySet())
		{

			if(o.getKey().contains("~"))
			{
				String[] spilt = o.getKey().split("~");
				if(!spilt[0].equals(Key))
				{
					Key = spilt[0];
					s = o.getKey().replaceAll("-", ",");
				}
				else
				{
					s = s + "," + spilt[1];
				}
			}
			else
			{
				System.out.println(indentationStr + o.getKey());
			}

			print(o.getValue(), indentationStr + indentationStrAddition, indentationStrAddition);
		}

		String line = indentationStr + s;

		if(!line.trim().isEmpty())
		{
			lines.add(line);
			System.out.println(line);
		}

	}

	/**
	* This is just a construct that helps us to parameterize recursively.
	*/
	static class Linked extends LinkedHashMap<String, Linked>
	{
		private static final long serialVersionUID = 1L;
	}
}