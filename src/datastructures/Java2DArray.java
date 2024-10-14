package datastructures;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Java2DArray {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/datastructures/strforjava2darray.txt")));


        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        calculHourglass(arr);
        bufferedReader.close();
    }

    private static void calculHourglass(List<List<Integer>> arr) {

        Integer maxValue = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.size() - 3; i++) {
            for (int j = 0; j <= arr.get(i).size() - 3; j++){
                int currentValue = arr.get(i).get(j)
                        + arr.get(i).get(j + 1)
                        + arr.get(i).get(j + 2)
                        + arr.get(i+1).get(j + 1)
                        + arr.get(i+2).get(j)
                        + arr.get(i+2).get(j+1)
                        + arr.get(i+2).get(j+2);
                maxValue = maxValue > currentValue ? maxValue : currentValue;
            }
        }
        System.out.println(maxValue);
    }
}