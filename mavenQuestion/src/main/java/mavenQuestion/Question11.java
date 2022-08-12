package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question11 {
	public static void main(String[] args) {
		BufferedReader br = null;
		int i = 1;
		try {
			br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/11/TextDocument"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		final String regex = "((BMI)|([Bb]o[ds]y mass index))[ \\-\\>\\<(A-Z)(a-z):=]*(?<BMI1>(\\d\\d\\.\\d)|(\\d\\d))?[ \\-\\>\\<(A-Z)(a-z):=]*(?<BMI2>(\\d\\d\\.\\d)|(\\d\\d))(?!\\%)";
		String s;
		try {
			while ((s = br.readLine()) != null) {

				final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
				final Matcher matcher = pattern.matcher(s);

				while (matcher.find()) {
					System.out.println(i + " = " + matcher.group(0));
					if(matcher.group("BMI1")!= null) {
						System.out.println("BMI1 value = " + matcher.group("BMI1"));
					}
					System.out.println("BMI2 value = " + matcher.group("BMI2") + "\n");

					i++;
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
