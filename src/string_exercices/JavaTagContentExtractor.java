package string_exercices;

import java.util.regex.*;

public class JavaTagContentExtractor {

    public static void main(String[] args) {
            String str = "<SA premium>Imtiaz has a secret crush</SA premium>";
            boolean found = false;

            Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }

    }
}
