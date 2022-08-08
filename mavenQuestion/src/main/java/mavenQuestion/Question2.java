package mavenQuestion;

import java.io.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question2 {

	public static int countMe(String i) {
		System.out.println("FileName - " + i);

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/2/" + i));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int count = 0;
		String s;
		try {
			while ((s = br.readLine()) != null) {

				String regex = "\\b^([T][h][e])\\b";

				Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
				Matcher matcher = pattern.matcher(s);

				while (matcher.find())
					count++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("No Of Pattern Find In This File = " + count);
		return count;

	}

	public static void main(String[] args) throws IOException {

		List<String> results = new ArrayList<String>();
		int Finalecount = 0;
		int noOfFiles = 0;
		File[] files = new File("/home/yagneshpancholi/Downloads/Problem_Input/2").listFiles();
		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());
			}
		}
		for (String i : results) {

			int count = countMe(i);
			noOfFiles++;
			Finalecount += count;
			System.out.println("FileNumber - " + noOfFiles + "\n");
		}
		System.out.println(Finalecount);
	}
}
