package advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeCheckerWithList {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 5));
        List<Integer> result = new ArrayList<>();
        for (Integer theInteger : intList) {
            primeChecker(theInteger, result).forEach(a -> {
                System.out.print(a + " ");
            });
            System.out.println();
        }
    }

    private static List<Integer> primeChecker(Integer numberToCheck, List<Integer> result) {
        if (numberToCheck > 1) {
            if (numberToCheck == 2) result.add(numberToCheck);
            if (numberToCheck == 3) result.add(numberToCheck);
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (!(numberToCheck % i == 0)) {
                    result.add(numberToCheck);
                }
            }
        }
        return result;
    }
}
