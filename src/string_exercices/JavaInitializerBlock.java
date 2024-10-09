package string_exercices;

import java.io.*;

public class JavaInitializerBlock {

    static {
        try {
            // BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
            File file = new File("C:\\Users\\NICOLAS.GAUTIER\\intellij-workspace\\java-hackerrank-preparation\\src\\strforinitializerblock.txt");
            BufferedReader bufferedReader = new BufferedReader((new FileReader(file)));
            int B = Integer.parseInt(bufferedReader.readLine());
            int H = Integer.parseInt(bufferedReader.readLine());
            if (B <= 0 || H <= 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            } else {
                System.out.println(B * H);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
