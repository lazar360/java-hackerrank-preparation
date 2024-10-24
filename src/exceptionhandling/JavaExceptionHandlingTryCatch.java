package exceptionhandling;

import java.io.*;
import java.util.InputMismatchException;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/exceptionhandling/strfortrycatch.txt")));
        try {
            int x = Integer.parseInt(bufferedReader.readLine());
            int y = Integer.parseInt(bufferedReader.readLine());
            System.out.println(x/y);
        } catch(InputMismatchException obj){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
