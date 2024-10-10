package string_exercices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaDatatypes {
    public static void main(String[] args) {
        File file = new File("src/string_exercices/strfordatatype.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int q = Integer.parseInt(bufferedReader.readLine().trim());

            while (q-- > 0) {
                String strToParse = bufferedReader.readLine();
                try {
                    Long num = Long.parseLong(strToParse);
                    System.out.println(num + " can be fitted in:");
                    if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) System.out.println("* byte");
                    if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) System.out.println("* short");
                    if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) System.out.println("* int");
                    System.out.println("* long");
                } catch (NumberFormatException e) {
                    System.out.println(strToParse + " can't be fitted anywhere.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}