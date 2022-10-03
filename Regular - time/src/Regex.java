import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String s = "Завтрак в 09:00";
        Pattern p = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
