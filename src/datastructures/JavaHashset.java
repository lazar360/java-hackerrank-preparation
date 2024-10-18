package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class JavaHashset {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/datastructures/strforjavahashset.txt")));
        int numberPairsString= Integer.parseInt(bufferedReader.readLine());
        Set<String> pairsString = new HashSet<>();
        while(numberPairsString-- != 0){
            pairsString.add(bufferedReader.readLine());
            System.out.println(pairsString.size());
        }
    }
}
