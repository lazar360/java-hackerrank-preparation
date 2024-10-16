package datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JavaList {
    public static void main(String[] args) throws IOException {

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/datastructures/strforjavalist.txt"));
        int N = Integer.parseInt(bufferedReader.readLine());
        List<Integer> list = new ArrayList<>(Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).toList());
        int Q = Integer.parseInt(bufferedReader.readLine());
        while (Q-- != 0) {
            String queryType = bufferedReader.readLine();
            if (Objects.equals(queryType, "Insert")) {
                List<Integer> xy = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).toList();
                list.add(xy.get(0), xy.get(1));
            } else if (Objects.equals(queryType, "Delete")) {
                int x = Integer.parseInt(bufferedReader.readLine());
                list.remove(x);
            }
        }
        list.forEach(num -> System.out.print(num + " "));
    }
}
