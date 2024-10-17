package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaMap {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/datastructures/strforjavamap.txt")));
        Map<String, Integer> phoneBook = new HashMap<>();
        int numberOfEntries = Integer.parseInt(bufferedReader.readLine());

        while (numberOfEntries-- !=0){
            String name = bufferedReader.readLine();
            int phoneNumber = Integer.parseInt(bufferedReader.readLine());
            phoneBook.put(name, phoneNumber);
        }

        List<String> phoneRequests = bufferedReader.lines().toList();

        for (String phoneRequest : phoneRequests) {
            if (phoneBook.get(phoneRequest) == null){
                System.out.println("Not found");
            } else {
                System.out.println(phoneRequest + "=" + phoneBook.get(phoneRequest));
            }
        }
    }
}
