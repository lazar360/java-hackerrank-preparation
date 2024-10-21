package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaGenerics {

    // Generic method to print elements of any array type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Example integer array
        Integer[] intArray = {1, 2, 3};

        // Example string array
        String[] strArray = {"Hello", "World"};

        // Call the generic method for both arrays
        printArray(intArray);
        printArray(strArray);
    }
}

