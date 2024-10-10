package string_exercices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/string_exercices/strforjavaendoffile.txt");
        Scanner scan = new Scanner(file);

        int count = 1;
        while (scan.hasNext()){
            String text = scan.nextLine();
            System.out.println(count + " " + text);
            count++;
        }
        scan.close();
    }
}
