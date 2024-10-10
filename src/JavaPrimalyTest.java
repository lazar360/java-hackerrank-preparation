import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class JavaPrimalyTest {

    public static void main(String[] args) {
        List<BigInteger> list = new ArrayList<>();
        list.add(BigInteger.valueOf(1));
        list.add(BigInteger.valueOf(3));
        list.add(BigInteger.valueOf(5));
        list.add(BigInteger.valueOf(7));
        list.add(BigInteger.valueOf(11));
        list.add(BigInteger.valueOf(13));


        list.forEach(a-> System.out.println(a.isProbablePrime(1)));
    }
}
