package string_exercices;

import java.io.*;
import java.time.LocalDate;

public class JavaDateandTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        File file = new File("src/string_exercices/strforjavadateandtime.txt");
        BufferedReader bufferedReader = new BufferedReader((new FileReader(file)));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateandTime.findDay(month, day, year);
        System.out.println(res);
    }

    public static String findDay(int month, int day, int year){
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
