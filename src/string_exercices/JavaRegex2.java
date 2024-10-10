package string_exercices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaRegex2 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/string_exercices/strforjavaregex2.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(bufferedReader.readLine());
        String regex = "\\b(?i)(\\w+)\\b(?=.*\\b(?i)\\1\\b)";

        for (int i = 0; i < n; i++) {
            String line = bufferedReader.readLine();
            String result = line.replaceAll(regex, "").replaceAll("\\s+", " ").trim();
            System.out.println(result);
        }
        bufferedReader.close();
    }
}
