package datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


// Write your Checker class here
class Checker implements Comparator<Player> {
    @Override
    public int compare(Player pl1, Player pl2) {
        if (pl1.score != pl2.score) {
            return Integer.compare(pl2.score, pl1.score);
        } else {
            return String.CASE_INSENSITIVE_ORDER.compare(pl1.name, pl2.name);
        }
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        // Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        // Arrays.sort(player, checker);
        Arrays.sort(player, (pl1, pl2) -> {
            if (pl1.score != pl2.score){
                return Integer.compare(pl2.score, pl1.score);
            } else {
                return String.CASE_INSENSITIVE_ORDER.compare(pl1.name, pl2.name);
            }
        });
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
