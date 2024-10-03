import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class JavaAnagrams {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\NICOLAS.GAUTIER\\intellij-workspace\\java-hackerrank-preparation\\src\\strforanagrams.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
        /*FileWriter file1 = new FileWriter("C:\\Users\\NICOLAS.GAUTIER\\intellij-workspace\\java-hackerrank-preparation\\src\\soluceAnagrams.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(file1);
        bufferedWriter.write(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");*/
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
