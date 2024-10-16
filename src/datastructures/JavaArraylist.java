package datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArraylist {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/datastructures/strforjavaarraylist.txt"));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<List<Integer>> integerList = new ArrayList<>();
        while (n-- != 0) {
            integerList.add(Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).toList());
        }

        int q = Integer.parseInt(bufferedReader.readLine());
        int numberOfQuerries = q;

        List<List<Integer>> queries = new ArrayList<>();
        while (q-- != 0) {
            queries.add(Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).toList());
        }
        for (int i = 0; i < numberOfQuerries; i++) {
            int listIndex = queries.get(i).get(0) - 1;
            int elementIndex = queries.get(i).get(1);

            if (elementIndex < integerList.get(listIndex).size()) {
                System.out.println(integerList.get(listIndex).get(elementIndex));
            } else {
                System.out.println("ERROR!");
            }

        }


    }
}
