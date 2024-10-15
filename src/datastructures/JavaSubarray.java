package datastructures;

import java.io.*;
import java.util.Arrays;
import java.util.Map;

/*
[1]
[1, -2]
[1, -2, 4]
[1, -2, 4, -5]
[1, -2, 4, -5, 1]
[-2]
[-2, 4]
[-2, 4, -5]
[-2, 4, -5, 1]
[4]
[4, -5]
[4, -5, 1]
[-5]
[-5, 1]
[1]
 */
public class JavaSubarray {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/datastructures/strforjavasubarray.txt"));
        int n = Integer.parseInt(bufferedReader.readLine());
        Integer[] arr = new Integer[n];
        String[] strArr = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
