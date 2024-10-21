package datastructures;

import java.io.*;
import java.util.BitSet;

public class JavaBitSet {
    public static void main(String[] args) throws IOException {

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/datastructures/strforjavabitset.txt")));
        String[] firstLine = bufferedReader.readLine().split(" ");
        int sizeOfBitsets = Integer.parseInt(firstLine[0]);
        int numberOfQueries = Integer.parseInt(firstLine[1]);

        BitSet bitSet1 = new BitSet(sizeOfBitsets);
        BitSet bitSet2 = new BitSet(sizeOfBitsets);

        while (numberOfQueries-- != 0) {
            String[] line = bufferedReader.readLine().split(" ");
            operationProceed(line, bitSet1, bitSet2);
        }

        bufferedReader.close();
    }

    private static void operationProceed(String[] line, BitSet bitSet1, BitSet bitSet2) {
        int index = Integer.parseInt(line[2]);
        if (line[1].equals("1")) {
            switch (line[0]) {
                case "AND" -> bitSet1.and(bitSet2);
                case "OR" -> bitSet1.or(bitSet2);
                case "XOR" -> bitSet1.xor(bitSet2);
                case "FLIP" -> bitSet1.flip(index);
                case "SET" -> bitSet1.set(index);
            }
        } else {
            switch (line[0]) {
                case "AND" -> bitSet2.and(bitSet1);
                case "OR" -> bitSet2.or(bitSet1);
                case "XOR" -> bitSet2.xor(bitSet1);
                case "FLIP" -> bitSet2.flip(index);
                case "SET" -> bitSet2.set(index);
            }
        }

        // Print the cardinality (count of bits set to true)
        System.out.printf("%d %d%n", bitSet1.cardinality(), bitSet2.cardinality());
    }
}
