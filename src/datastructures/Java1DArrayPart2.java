package datastructures;

import java.io.*;
import java.util.Arrays;

/*
You're standing at index 0 of an n-element array named game.
You can move from index  to index i, i+1, i-1 or i + leap  as long as the destination index is a cell containing a 0.
If the destination index is greater than n-1, you win the game.
 */
public class Java1DArrayPart2 {

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/datastructures/strforjava1darraypart2.txt")));
        int numberOfQueries = Integer.parseInt(bufferedReader.readLine());
        while (numberOfQueries-- != 0) {
            int[] query = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int[] game = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            System.out.println(canWin(query, game) ? "YES" : "NO");
        }
    }

    private static boolean canWin(int[] query, int[] game) {
        int leap = query[1];
        return canWinFromPosition(game, leap, 0);
    }

    private static boolean canWinFromPosition(int[] game, int leap, int position) {
        if (position < 0 || game[position] == 1) { // game over : too much backward or no move
            return false;
        }
        if (position + 1 >= game.length || position + leap >= game.length) { // you win the game
            return true;
        }

        game[position] = 1; // mark as visited

        // move forward
        if (canWinFromPosition(game, leap, position + 1)) {
            return true;
        }
        // move backward
        if (canWinFromPosition(game, leap, position - 1)) {
            return true;
        }
        // leap forward
        if (canWinFromPosition(game, leap, position + leap)) {
            return true;
        }

        return false;
    }
}
