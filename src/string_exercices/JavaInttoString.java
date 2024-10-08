package string_exercices;

import java.io.*;

public class JavaInttoString {

    public static void main(String[] args) throws FileNotFoundException {
        // BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        File file = new File("src/string_exercices/strforjavainttostring.txt");
        BufferedReader bufferedReader = new BufferedReader((new FileReader(file)));

        try{
            String s = bufferedReader.readLine();
            System.out.println(s.getClass().getName().contains("String") ? "Good job" : "Wrong answer");
            bufferedReader.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
