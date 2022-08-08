package quest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Question2alt {

	public static void main(String[] args) {
//		List<String> results = new ArrayList<String>();
//		File[] files = new File("/home/yagneshpancholi/Downloads/Problem_Input/2").listFiles();
//		for (File file : files) {
//		    if (file.isFile()) {
//		        results.add(file.getName());
//		    }
//		}
//		for(String s :results) {
//			System.out.println(s);
//			
//		}
		
		
		try {

		BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/2/2084207.txt"));
		String regex = "\\b([Tt]he)\\b";
		Pattern p = Pattern.compile(regex,Pattern.MULTILINE);
		String s;
		int count = 0;
		int noOfLines = 0;
					while((s = br.readLine()) != null ) {
//				if(Pattern.matches("\\b(^[T][h][e])\\b", s)) {
//					count++;
//				}
						Matcher m = p.matcher(s);
						while (m.find()) {
							m.matches();
							count++;
						}
							 
				           
				            
						noOfLines++;
			}
					System.out.println(count + " " + noOfLines);
					br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
