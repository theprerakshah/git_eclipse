package quest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question2alter2{
    public static void main(String[] args) {
         String regex = "\\b([T][h][e])\\b";
        String string = "";        
         Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
        	count++;
}
        System.out.println(count);
        }
    }
