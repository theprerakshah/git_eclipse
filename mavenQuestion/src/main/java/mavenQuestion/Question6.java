package mavenQuestion;

import java.io.*;
import java.util.*;

import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

import com.sun.tools.javac.util.List;

public class Question6 {
	public static void main(String[] args) {
		File[] files = new File("/home/yagneshpancholi/Downloads/Problem_Input/6").listFiles();
		for (File f : files) {
			if (f.isFile()) {
				System.out.println(f.getName());

				countMe(f);
			}
		}
	}

	public static void countMe(File f) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("med");
		mylist.add("meas");
		mylist.add("lab");
		mylist.add("problem");
		mylist.add("procedure");
		mylist.add("anatomicalStructure");
		mylist.add("finding");
		mylist.add("bodyFunction");
		mylist.add("medicalDevice");
		mylist.add("modifier");
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = null;
			db = dbf.newDocumentBuilder();
			Document doc = db.parse(f);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			for (String k : mylist) {
				NodeList ndl = doc.getElementsByTagName(k);
				System.out.println(k + " = " + ndl.getLength());
			}
//			NodeList n = doc.getElementsByTagName("RelationSet");
//			for (int i = 0; i < n.getLength(); ++i) {
//				Node newNode = n.item(i);
//				if (newNode.getNodeType() == newNode.ELEMENT_NODE) {
//					NodeList m = newNode.getChildNodes();
//					for (int j = 0; j < m.getLength(); j++) {
//						for (String k : mylist) {
//							NodeList ndl = doc.getElementsByTagName(k);
//							System.out.println(k + " = " + ndl.getLength());
//						}
//					}
//				}
//
//			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
