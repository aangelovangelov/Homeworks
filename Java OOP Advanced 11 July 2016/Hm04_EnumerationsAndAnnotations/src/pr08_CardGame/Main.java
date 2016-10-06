package pr08_CardGame;

import javax.naming.OperationNotSupportedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, OperationNotSupportedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player firstPlayer = new Player(reader.readLine());
        Player secondPlayer = new Player(reader.readLine());
        Deck deck = new Deck();

        while (firstPlayer.getCardsCount() < 5) {
            try {
                firstPlayer.addCard(deck.getCard(reader.readLine()));
            } catch (IllegalArgumentException | IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }
        }

        while (secondPlayer.getCardsCount() < 5) {
            try {
                secondPlayer.addCard(deck.getCard(reader.readLine()));
            } catch (IllegalArgumentException | IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }
        }

        Player winner = getWinner(firstPlayer, secondPlayer);
        System.out.printf("%s wins with %s.",
                winner.getName(),
                winner.getHighestCard().getName());
    }

    private static Player getWinner(Player firstPlayer, Player secondPlayer) {
        if (firstPlayer.getHighestCard().compareTo(secondPlayer.getHighestCard()) >= 0) {
            return firstPlayer;
        }

        return secondPlayer;
    }
}
