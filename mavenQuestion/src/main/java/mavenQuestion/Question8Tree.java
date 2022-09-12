package mavenQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class Tree1
{

	String				name;
	Set<String>			codes;
	Map<String, Tree1>	children;

	public Tree1()
	{
		this.name = null;
		this.codes = new HashSet<>();
		this.children = new LinkedHashMap<>();
	}

	public void printTree(String tab, BufferedWriter bw) throws IOException
	{

		if(!codes.isEmpty())
		{
			String s = tab + name + " ~" + codes;
			//System.out.println(s.replace("[", "").replace("]", ""));
			String s1 = s.replace("[", " ").replace("]", " ");
			bw.append(s1 + "\n");
		}
		else
		{
			String s = tab + name;
			//System.out.println(s.replace("[", "").replace("]", ""));
			//String s1 = s.replace("[", " ").replace("]", " ");
			bw.append(s + "\n");

		}

		for(Tree1 childChild : children.values())
		{
			childChild.printTree(tab + "\t", bw);
		}
	}

	public void addChild(Tree1 child)
	{
		// TODO Auto-generated method stub
		if(!children.containsKey(child.name))
		{
			children.put(child.name, child);
		}

		else
		{
			Tree1 existingTree = children.get(child.name);
			//			existingTree.addChild(child);

			existingTree.codes.addAll(child.codes);

			for(Tree1 childChild : child.children.values())
			{
				existingTree.addChild(childChild);
			}
		}
	}

	public void addCodes(Set<String> codes)
	{
		this.codes.addAll(codes);
	}
}

public class Question8Tree
{

	public static Tree1 getTreeFromLine(String[] line)
	{
		Tree1 lastTree = null;

		for(int i = line.length - 1; i >= 1; i--)
		{
			Tree1 currNode = new Tree1();
			currNode.name = line[i];
			if(lastTree != null)
			{
				currNode.addChild(lastTree);
			}
			if(i == line.length - 1)
			{
				currNode.addCodes(convertToSet(line[0]));
			}
			lastTree = currNode;
		}

		return lastTree;
	}

	private static Set<String> convertToSet(String str)
	{
		// TODO Auto-generated method stub
		Set<String> code = new HashSet<>();
		String[] codes = str.split(",");
		for(String s : codes)
		{
			code.add(s);
		}
		return code;
	}

	public static void printTree(Tree1 tree, String tab)
	{
		Stack<Tree1> stackTree = new Stack<>();
		Stack<String> tabstack = new Stack<>();

		stackTree.push(tree);
		tabstack.push(tab);
		while(!stackTree.isEmpty())
		{

			Tree1 popTree = stackTree.pop();
			tab = tabstack.pop();
			if(!popTree.codes.isEmpty())
			{
				String s = tab + popTree.name + "~" + popTree.codes;
				System.out.println(s.replace("[", "").replace("]", ""));

			}
			else
			{
				String s = tab + popTree.name;
				System.out.println(s.replace("[", "").replace("]", ""));
			}
			for(Tree1 childChild : popTree.children.values())
			{
				stackTree.push(childChild);
				tabstack.push(tab + "\t");
			}

		}
	}

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Tree1 root = new Tree1();
		BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/8/InputFile"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/yagneshpancholi/Desktop/Question8Output.txt"));
		String str = "";
		while((str = br.readLine()) != null)
		{
			String[] split1 = str.split("\\t");
			Tree1 tree = getTreeFromLine(split1);

			root.addChild(tree);
		}

		for(Tree1 childChild : root.children.values())
		{
			childChild.printTree("", bw);
			//			printTree(childChild, "");
		}
		br.close();
		bw.close();
	}

}
