package datastructures;

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

