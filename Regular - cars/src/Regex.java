import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String s = "ВАЗ2103 ВАЗ2106 ВАЗ2101";
        Pattern p = Pattern.compile("ВАЗ2101");
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.println("В списке есть марка " + m.group());
        }
        else {
            System.out.println("В списке нет искомой марки");
        }
    }
}
