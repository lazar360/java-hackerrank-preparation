package string_exercices;

import java.io.*;

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
