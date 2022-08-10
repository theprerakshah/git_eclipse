package mavenQuestion;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Question6Alter {

	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		File[] files = new File("/home/yagneshpancholi/Downloads/Problem_Input/6").listFiles();
		for (File f : files) {
			if (f.isFile()) {
				System.out.println(f.getName());
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = null;
				try {
					db = dbf.newDocumentBuilder();
				} catch (ParserConfigurationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Document doc = null;
				try {
					doc = db.parse(f);
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				doc.getDocumentElement().normalize();
				System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
				NodeList first =  doc.getElementsByTagName("RelationSet");
				for (int i = 0; i < first.getLength(); i++) {
					Node n = first.item(i);
					if(n.getNodeType() == n.ELEMENT_NODE) {
						NodeList second = n.getChildNodes();
						for(int j = 0; j < second.getLength() ; j++) {
							Node n1 = second.item(j);
							if(map1.containsKey(n1.getNodeName())) {
								map1.put(n1.getNodeName(),map1.get(n1.getNodeName()) + 1);
							}else {
								map1.put(n1.getNodeName(), 1);
							}
						}
					}
				}
				System.out.println(map1);
				
			}
		}

	}

}
