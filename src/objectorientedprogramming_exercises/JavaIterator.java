package objectorientedprogramming_exercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class JavaIterator {

    public static void main(String[] args) {
            /*String[] arr = {
                    "42",
                    "10",
                    "###",
                    "Hello",
                    "Java"
            };
            Iterator it = Arrays.stream(arr).iterator();
            */
        List<String> list = List.of("42", "10", "###", "Hello", "Java");
        Iterator it = list.listIterator();
        boolean isDeletable = true;
        while (it.hasNext()){
            String word = (String) it.next();
            if (Objects.equals("###", word)) {
                isDeletable = false;
                continue;
            }
            if (!isDeletable) {
            System.out.println(word);
            }
        }
    }
}
