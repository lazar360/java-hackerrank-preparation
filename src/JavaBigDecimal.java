import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
Given an array, s of n  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).
Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.
 */
public class JavaBigDecimal {

    public static void main(String[] args) throws IOException {

        File file = new File("src/strforjavabigdecimal.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<String> stringList = new ArrayList<>();

        while(n--!=0){
            String tmp = bufferedReader.readLine();
            stringList.add(tmp);
        }

        stringList.sort((o1, o2) ->{
            BigDecimal firstBigDecimal = new BigDecimal(o1);
            BigDecimal secondBigDecimal = new BigDecimal(o2);
            return secondBigDecimal.compareTo(firstBigDecimal);
        });
        stringList.forEach(System.out::println);
    }
}
