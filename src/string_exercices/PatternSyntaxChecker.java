package string_exercices;

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\NICOLAS.GAUTIER\\intellij-workspace\\java-hackerrank-preparation\\src\\strforpatternsyntaxchecker.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            String REGEX = bufferedReader.readLine(); // create a REGEX String
            try {
                Pattern.compile(REGEX); // compile the regex to create pattern
                System.out.println("Valid");
            } catch(PatternSyntaxException p){
                System.out.println("Invalid");
            }
        }
    }
}
