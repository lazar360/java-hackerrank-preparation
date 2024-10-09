package string_exercices;

import java.util.List;

public class JavaStringTokens {

    public static void main(String[] args) {

        String s = "He is a very very good boy, isn't he?";
        s = s.trim().toLowerCase().replaceAll("[^a-zA-Z]", " ");
        List<String> listStr = List.of(s.split(" "));
        int counter = 0;
        for (String str : listStr) {
            if (str.isEmpty()) continue;
            counter++;
        }
        System.out.println(counter);
        for (String str : listStr) {
            if (str.isEmpty()) continue;
            System.out.println(str);
        }
    }

}
