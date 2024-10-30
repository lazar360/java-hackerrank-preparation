package datastructures;

import java.io.*;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/datastructures/strforjavastack.txt")));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(isBalanced(line));
        }

    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    // Ignore non-parenthesis characters
                    break;
            }
        }

        return stack.isEmpty(); // If the stack is empty, all parentheses are balanced
    }
}
