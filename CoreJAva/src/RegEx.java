import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pattern p = Pattern.compile("..m");
//		Matcher m = p.matcher("aim");
//		boolean b = m.matches();
//		System.out.println(b);
//		boolean b2 = Pattern.compile(".m").matcher("abcdm").matches();
//		System.out.println(b2);
//		boolean b3 = Pattern.matches(".m", "am");
//		System.out.println(b3);
		System.out.println(Pattern.matches("[B][A-Z]{2}", "BMI"));
		
	}

	
}