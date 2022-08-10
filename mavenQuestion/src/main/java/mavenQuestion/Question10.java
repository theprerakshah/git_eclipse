package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question10 {
	public static ArrayList generateList(String s) {
		ArrayList<String> ansList = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/10/LatestIcd10Codes"));
			String sLine = null;

			while ((sLine = br.readLine()) != null) {
				String regex = s;
				Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
				Matcher matcher = pattern.matcher(sLine);

				while (matcher.find()) {
					ansList.add(sLine);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ansList;
	}

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		List<String> myList1 = new ArrayList<String>();
		List<String> myList2 = new ArrayList<String>();
		String regex = "Z68\\..*";
		myList = generateList(regex);
		// System.out.println(myList);
		String regex1 = "Z3A\\..*";
		myList1 = generateList(regex1);
		// System.out.println(myList1);
		String regex2 = "E11\\..*";
		myList2 = generateList(regex2);
		// System.out.println(myList2);

		System.out.println("equation1");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i) + " + I10 = I11.2 + " + myList.get(i));
		}
		System.out.println("\n");
		System.out.println("equation3");
		for (int i = 0; i < myList2.size(); i++) {
			System.out.println(myList2.get(i) + " + R11.2 = " + myList2.get(i) + " + R05");
		}
		System.out.println("\n");
		System.out.println("equation2");
		for (int i = 0; i < myList1.size(); i++) {
			for (int j = 0; j < myList.size(); j++) {
				System.out.println(myList1.get(i) + " + " + myList.get(j) + " = I10 + N18.6 + " + myList1.get(i));
			}
		}
	}

}
