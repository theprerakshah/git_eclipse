package mavenQuestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question4 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedReader br1= null;
		try {
			br = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/4/2.csv"));
			br1 = new BufferedReader(new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/4/1.tsv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s,s2;
		int sum = 0,sum1= 0;
		try {
			br.readLine();
			while ((s = br.readLine()) != null) {
				String[] s1 = s.split(",");
				sum = sum + Integer.parseInt(s1[6]);
			}
			br1.readLine();
			while ((s2 = br1.readLine()) != null) {
				String[] s3 = s2.split("	");
				sum1= sum1+ Integer.parseInt(s3[4]);
			}
			br.close();
			br1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "CSV File = " + sum);
		System.out.println( "TSV File = "+sum1);
	}

}
