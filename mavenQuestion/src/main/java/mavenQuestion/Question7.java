package mavenQuestion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question7 {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		List<Integer> tabCount = new ArrayList<Integer>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/7/InputFile"));

			String s;

			while ((s = br.readLine()) != null) {
				String s1 = s.split("@@")[0];
				mylist.add(s1);
				
				tabCount.add(countTabs(s1));
//				System.out.println(tabCount.size());
				// (~ [0-9A-Z]*)
				// \t
//				int count =0;
//				for (String i : mylist) {
//					++count;
//					if(Pattern.matches("~ [0-9A-Z]*", i)) {
//						System.out.println(mylist.get(count));
//					}
//				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int countTabs(String s1) {
		// TODO Auto-generated method stub
		String regex = "\\t";
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(s1);
		int c = 0;
		while (matcher.find()) {
			++c;
		}
		return c;
	}

}
