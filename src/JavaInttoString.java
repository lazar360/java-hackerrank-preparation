import java.io.*;

public class JavaInttoString {

    public static void main(String[] args) throws FileNotFoundException {
        // BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        File file = new File("C:\\Users\\NICOLAS.GAUTIER\\intellij-workspace\\java-hackerrank-preparation\\src\\strforjavainttostring");
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
