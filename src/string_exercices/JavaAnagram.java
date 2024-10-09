package string_exercices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaAnagram {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String A = bufferedReader.readLine();
        char[] array = A.toCharArray();
        String result = "Yes";
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                result = "No";
            }
        }

        System.out.println(result);
    }
}


