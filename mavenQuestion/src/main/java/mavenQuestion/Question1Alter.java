package mavenQuestion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Question1Alter {

	public static List readFiles(File f) {
		List<String> ans = new ArrayList<String>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			String s;
			while ((s = br.readLine()) != null) {
				ans.add(s);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ans;
	}

	public static void deleteFile(File file, List<String> ans) {
		if (ans.contains(file.getName())) {
			file.delete();
			System.out.println("file is Deleted" + " " + file.getName());

		}
	}

	public static void deleteFolderFiles(File file, List<String> ans) {
		File[] fname = file.listFiles();
		for (File f2 : fname) {
			if (f2.isFile()) {
				if (ans.contains(f2.getName())) {
					f2.delete();
					System.out.println("file is Deleted" + " " + f2.getName());

				}
			} else if (f2.isDirectory()) {
				deleteFolderFiles(f2, ans);
			}
		}

	}

	public static void main(String[] args) {
		File f = new File("/home/yagneshpancholi/Downloads/Problem_Input/1/InputFolder");
		File f1 = new File("/home/yagneshpancholi/Downloads/Problem_Input/1/DeleteFiles.txt");
		List<String> ans = new ArrayList<String>();
		ans = readFiles(f1);

		File[] fileNames = f.listFiles();
		for (File file : fileNames) {
			if (file.isFile()) {
				deleteFile(file, ans);
			} else if (file.isDirectory()) {
				deleteFolderFiles(file, ans);
			} else {
				System.out.println("no file found");
			}
		}

	}
}