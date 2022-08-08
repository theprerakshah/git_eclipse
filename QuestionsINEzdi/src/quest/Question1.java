package quest;

import java.io.*;
import java.io.BufferedReader;

public class Question1 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/yagneshpancholi/Downloads/Problem_Input/1/DeleteFiles.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
				File file = new File("/home/yagneshpancholi/Downloads/Problem_Input/1/InputFolder/" + s);

				if (file.delete()) {
					System.out.println("File deleted successfully");
				} else {
					System.out.println("Failed to delete the file");
					File file1 = new File("/home/yagneshpancholi/Downloads/Problem_Input/1/InputFolder/1/" + s);

					if (file1.delete()) {
						System.out.println("File deleted successfully");
					} else {
						System.out.println("Failed to delete the file");
						File file2 = new File("/home/yagneshpancholi/Downloads/Problem_Input/1/InputFolder/2/" + s);

						if (file2.delete()) {
							System.out.println("File deleted successfully");
						} else {
							System.out.println("No Such file");
						}
					}
				}

			}

			br.close();
		} catch (Exception e) {
		}
	}

}
