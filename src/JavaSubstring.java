import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSubstring {

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            list.add(s.substring(i, i + k));
        }
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));




    }
}
