package advanced;

import java.io.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        try {
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new FileReader("src/advanced/strforsolution.txt"));
            BigInteger n1 = new BigInteger(br.readLine());
            BigInteger n2 = new BigInteger(br.readLine());
            BigInteger n3 = new BigInteger(br.readLine());
            BigInteger n4 = new BigInteger(br.readLine());
            BigInteger n5 = new BigInteger(br.readLine());
            primeCheck(n1);
            primeCheck(n1, n2);
            primeCheck(n1, n2, n3);
            primeCheck(n1, n2, n3, n4, n5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void primeCheck(BigInteger... bigIntegers) {
        for (BigInteger bigInteger : bigIntegers) {
            if(bigInteger.isProbablePrime(10)){
                System.out.print(bigInteger + " ");
            }
        }
        System.out.println();
    }
}
