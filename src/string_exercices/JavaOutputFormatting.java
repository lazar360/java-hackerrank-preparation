package string_exercices;

import java.io.*;


/*
Input Format :
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0  to 999.

Output Format :
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Example input :
java 100
cpp 65
python 50

Example output :
================================
java           100
cpp            065
python         050
================================
 */
public class JavaOutputFormatting {
    public static void main(String[] args) throws IOException {

        File file = new File("src/string_exercices/strforexercises.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        System.out.println("================================");
        while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(" "); // Split based on space
            String language = parts[0]; // The language name
            int score = Integer.parseInt(parts[1]); // The score

            // Print using printf with formatting
            System.out.printf("%-15s%03d%n", language, score); // %-15s left-aligns and %03d zero-pads to 3 digits
        }
        System.out.println("================================");
        bufferedReader.close();

    }
}
