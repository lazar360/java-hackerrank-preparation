package string_exercices;

import java.io.*;
import java.util.regex.Pattern;

public class JavaRegex {

    public static void main(String[] args) throws IOException {
        File file = new File("src/string_exercices/strforjavaregex.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        Pattern pattern = Pattern.compile(new MyRegex().getIpAddressRegex(), Pattern.CASE_INSENSITIVE);
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(pattern.matcher(line).find());
        }
        bufferedReader.close();
    }

    static class MyRegex{
        private String ipAddressRegex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        public String getIpAddressRegex() {
            return ipAddressRegex;
        }
    }
}
