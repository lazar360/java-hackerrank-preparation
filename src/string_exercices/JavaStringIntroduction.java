package string_exercices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 */

public class JavaStringIntroduction {

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstString = bufferedReader.readLine();
        String secondString = bufferedReader.readLine();*/
        String firstString = "hello";
        String secondString = "java";
        System.out.println(firstString.length() + secondString.length());
        System.out.println(firstString.compareTo(secondString) > 0 ? "Yes" : "No");
        System.out.printf("""
                %s %s
                %n""", firstString.replaceFirst(firstString.substring(0, 1), firstString.substring(0, 1).toUpperCase()
       ), secondString.replaceFirst(secondString.substring(0, 1), secondString.substring(0, 1).toUpperCase()
       )
);


    }

}
