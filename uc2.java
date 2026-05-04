import java.util.Random;

public class uc2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int toss = rand.nextInt(2);

        char player1Symbol;
        char player2Symbol;
        char currentPlayer;

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1Symbol;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2Symbol;
        }

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("First Turn: " + currentPlayer);
    }
}
