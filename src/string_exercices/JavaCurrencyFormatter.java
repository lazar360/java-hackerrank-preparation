package string_exercices;

import java.io.*;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class JavaCurrencyFormatter {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        File file = new File("src/string_exercices/strforjavacurrencyformatter.txt");
        BufferedReader bufferedReader = new BufferedReader((new FileReader(file)));
        double payment = Double.parseDouble(bufferedReader.readLine());
        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n1.format(payment);

        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = n2.format(payment);

        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n3.format(payment);

        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n4.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
