package pr08_CardGame;

import pr08_CardGame.enums.Rank;
import pr08_CardGame.enums.Suit;

import java.util.HashMap;
import java.util.Map;

public class Deck {

    private Map<String, Card> deck;

    public Deck() {
        this.deck = new HashMap<>();
        generateDeck();
    }

    public Card getCard(String cardName) {
        if (! this.deck.containsKey(cardName)) {
            throw new IllegalArgumentException("No such card exists.");
        }
        if (this.deck.get(cardName) == null) {
            throw new IllegalStateException("Card is not in the deck.");
        }

        Card card = this.deck.get(cardName);
        this.deck.put(cardName, null);
        return card;
    }

    private void generateDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                this.deck.put(card.getName(), card);
            }
        }
    }
}
