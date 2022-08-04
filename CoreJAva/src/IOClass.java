import java.io.*;

public class IOClass {

	public static void main(String[] args) {
		try {
			
//			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/yagneshpancholi/Desktop/Test/abc.txt"));
//			bw.write("Yagnesh\n");
//			bw.write("Pancholi ");
//			bw.write("Dineshkumar");
//			bw.close();
			BufferedReader br = new BufferedReader(new FileReader("/home/yagneshpancholi/Desktop/Test/abc.txt"));
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
