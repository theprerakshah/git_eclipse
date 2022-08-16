package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Question12 {

	public static void main(String[] args) {

		ArrayList<String[]> myList = new ArrayList<String[]>();
		ArrayList<String> myConflictList = new ArrayList<String>();
		HashSet<String> myUniqueList = new HashSet<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/12/Inputfile"));
			String s;
			while ((s = br.readLine()) != null) {
				String[] str = { s.split("\t")[0], s.split("\t")[1] + "\t" + s.split("\t")[2] };
				myList.add(str);
			}

			for (String[] s1 : myList) {
				String one = s1[0];
				String two = s1[1];
				boolean myBoolean = true;
				for (String[] s2 : myList) {
					if (one.equals(s2[0])) {
						if (s2[1].equals(two)) {
							myBoolean = true;
						} else {
							myBoolean = false;
							break;
						}
					}
				}
				if (myBoolean == false) {
					myConflictList.add(one + "\t" + two);
				} else {
					myUniqueList.add(one + "\t" + two);
				}

			}
			System.out.println("ConflictList\n");
			for (String i : myConflictList) {
				System.out.println(i);
			}
			System.out.println("\nUniqueList\n");
			for (String i : myUniqueList) {
				System.out.println(i);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
