package mavenQuestion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Question1Alter {

	public static List readFiles(File f) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s;
		List<String> ans = new ArrayList<String>();
		try {
			while ((s = br.readLine()) != null) {
				ans.add(s);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	}

	public static void main(String[] args) {
		File f = new File("/home/yagneshpancholi/Downloads/Problem_Input/1/DeleteFiles.txt");
		// System.out.println( f.getPath());
		List<String> ans = new ArrayList<String>();
		ans = readFiles(f);
//		for(String i:ans) {
//			System.out.println(i);
//		}
		for (String i : ans) {
			File file = new File("/home/yagneshpancholi/Downloads/Problem_Input/1/InputFolder" + i);
			if (file.isFile()) {
				System.out.println("file is here");
				file.delete();
				System.out.println("file Deleted");
			}else if (file.isDirectory()) {
				File[] fname = file.listFiles();
				for (File f1 : fname) {
					if (f1.isFile()) {
						f1.delete();
						System.out.println("file Deleted");
					}
				}

			} else {
				System.out.println("no file found");
			}
		}
	}
}