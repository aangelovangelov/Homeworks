package pr08_CardGame;

import javax.naming.OperationNotSupportedException;
import java.util.TreeSet;

public class Player {

    private String name;
    private TreeSet<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public int getCardsCount() {
        return this.cards.size();
    }

    public Card getHighestCard() {
        return this.cards.last();
    }

    public void addCard(Card card) throws OperationNotSupportedException {
        this.cards.add(card);
    }
}
