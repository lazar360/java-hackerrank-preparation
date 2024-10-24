package exceptionhandling;

import java.io.*;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/exceptionhandling/strfortrycatch.txt")));
        try {
            int x = Integer.parseInt(bufferedReader.readLine());
            int y = Integer.parseInt(bufferedReader.readLine());
            System.out.println(x/y);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }


    }
}
