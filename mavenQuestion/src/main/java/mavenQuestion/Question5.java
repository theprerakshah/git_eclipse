package mavenQuestion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Question5 {

	public static void main(String[] args) {
		File[] files = new File("/home/yagneshpancholi/Downloads/Problem_Input/5").listFiles();
		for (File file : files) {
			if (file.isFile()) {

				try {

					DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					DocumentBuilder db = null;

					db = dbf.newDocumentBuilder();
					Document doc = db.parse(file);
					doc.getDocumentElement().normalize();
					System.out.println(file.getName());
					System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
					NodeList nodeList = doc.getElementsByTagName("Icd10CmCode");

					for (int i = 0; i < nodeList.getLength(); ++i) {

						Node n = nodeList.item(i);
						System.out.println("\nNode Name :" + n.getNodeName());
						if (n.getNodeType() == n.ELEMENT_NODE) {
							NodeList m = n.getChildNodes();
							int rank = 0;
							String value = "";
							for (int j = 0; j < m.getLength(); j++) {

								Node n1 = m.item(j);

								if (n1.getNodeName() == "code") {

									if (n1.getNodeType() == n1.ELEMENT_NODE) {

										Element elmt = (Element) n1;
										// System.out.println(elmt.getAttribute("value"));
										int temprank = Integer.parseInt((elmt.getAttribute("rank")));

										if (temprank > rank) {
											rank = temprank;
											value = elmt.getAttribute("value");
										}

									}

								}

							}
							System.out.println(rank);
							System.out.println(value);

						}
					}
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
