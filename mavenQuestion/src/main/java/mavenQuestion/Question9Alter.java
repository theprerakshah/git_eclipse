package mavenQuestion;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Question9Alter
{

	public static void main(String[] args)
	{
		File[] file1 = new File("/home/yagneshpancholi/Downloads/Problem_Input/9/CM1").listFiles();
		File[] file2 = new File("/home/yagneshpancholi/Downloads/Problem_Input/9/CM2").listFiles();

		for(File f : file1)
		{
			boolean temp = true;
			for(File f1 : file2)
			{

				if(f.getName().equals(f1.getName()))
				{
					System.out.println(f.getName() + "\n");
					Set<String> tempSet1 = generateSet(f);
					Set<String> tempSet2 = generateSet(f1);
					printIntersaction(tempSet1, tempSet2);
					printDifference(tempSet1, tempSet2);

					temp = false;
					break;
				}

			}
			if(temp)
			{
				System.out.println("No File Matched " + f.getName() + "\n");
			}
		}
	}

	private static void printDifference(Set<String> tempSet1, Set<String> tempSet2)
	{
		// TODO Auto-generated method stub
		Set<String> difference = new HashSet<String>(tempSet1);
		difference.removeAll(tempSet2);
		System.out.println("Difference :");
		System.out.println(difference);
		System.out.println(difference.size() + "\n");

	}

	private static void printIntersaction(Set<String> tempSet1, Set<String> tempSet2)
	{
		// TODO Auto-generated method stub
		// To find intersection
		Set<String> intersection = new HashSet<String>(tempSet1);
		intersection.retainAll(tempSet1);
		System.out.println("Intersection :");
		System.out.println(intersection);
		System.out.println(intersection.size() + "\n");

	}

	public static Set<String> generateSet(File f)
	{
		Set<String> ansSet = new HashSet<String>();
		try
		{

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = null;

			db = dbf.newDocumentBuilder();
			Document doc = db.parse(f);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("Icd10CmCode");

			for(int i = 0; i < nodeList.getLength(); ++i)
			{

				Node n = nodeList.item(i);
				if(n.getNodeType() == n.ELEMENT_NODE)
				{
					NodeList m = n.getChildNodes();
					int rank = 0;
					Stack<String> tempStack = new Stack<String>();

					for(int j = 0; j < m.getLength(); j++)
					{

						Node n1 = m.item(j);

						if(n1.getNodeName() == "code")
						{

							if(n1.getNodeType() == n1.ELEMENT_NODE)
							{

								Element elmt = (Element) n1;
								// System.out.println(elmt.getAttribute("value"));
								int temprank = Integer.parseInt((elmt.getAttribute("rank")));

								if(temprank > rank)
								{
									rank = temprank;
									tempStack.push(elmt.getAttribute("value"));

								}
							}

						}
					}
					ansSet.add(tempStack.pop());
				}

			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return ansSet;
	}
}
