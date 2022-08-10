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

public class Question9 {
	public static Set<String> generateSet(File f) {
		Set<String> ansSet = new HashSet<String>();
		try {

			File[] file = f.listFiles();
			for (File file1 : file) {
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = null;

				db = dbf.newDocumentBuilder();
				Document doc = db.parse(file1);
				doc.getDocumentElement().normalize();
				NodeList nodeList = doc.getElementsByTagName("Icd10CmCode");

				for (int i = 0; i < nodeList.getLength(); ++i) {

					Node n = nodeList.item(i);
					if (n.getNodeType() == n.ELEMENT_NODE) {
						NodeList m = n.getChildNodes();
						int rank = 0;
						Stack<String> tempStack = new Stack<String>();

						for (int j = 0; j < m.getLength(); j++) {

							Node n1 = m.item(j);

							if (n1.getNodeName() == "code") {

								if (n1.getNodeType() == n1.ELEMENT_NODE) {

									Element elmt = (Element) n1;
									// System.out.println(elmt.getAttribute("value"));
									int temprank = Integer.parseInt((elmt.getAttribute("rank")));

									if (temprank > rank) {
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
		} catch (Exception e) {
			System.out.println(e);
		}

		return ansSet;
	}

	public static void main(String[] args) {
		Set<String> mySetCM1 = new HashSet<String>();
		Set<String> mySetCM2 = new HashSet<String>();

		File fileCM1 = new File("/home/yagneshpancholi/Downloads/Problem_Input/9/CM1");
		File fileCM2 = new File("/home/yagneshpancholi/Downloads/Problem_Input/9/CM2");
//		for (File f : fileNames) {
//			System.out.println(f.getName());
//			mySetCM1 = generateSet(f);
//			//System.out.println(mySetCM1);
//
//		}
		mySetCM1 = generateSet(fileCM1);
		mySetCM2 = generateSet(fileCM2);
		System.out.println("CM1");
		System.out.println(mySetCM1);
		System.out.println(mySetCM1.size() + "\n");
		System.out.println("CM2");
		System.out.println(mySetCM2);
		System.out.println(mySetCM2.size() + "\n");
		// To find intersection
		Set<String> intersection = new HashSet<String>(mySetCM1);
		intersection.retainAll(mySetCM2);
		System.out.println("Intersection of the two Set");
		System.out.println(intersection);
		System.out.println(intersection.size() + "\n");
		Set<String> difference = new HashSet<String>(mySetCM1);
		difference.removeAll(mySetCM2);
		System.out.println("Difference of the two Set");
		System.out.println(difference);
		System.out.println(difference.size());

	}
}