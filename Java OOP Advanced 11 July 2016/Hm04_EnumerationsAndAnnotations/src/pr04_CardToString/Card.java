package pr04_CardToString;

import pr04_CardToString.enums.CardRank;
import pr04_CardToString.enums.CardSuit;

public class Card {

    private CardRank rank;
    private CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.name(),
                this.suit.name(),
                this.rank.getPower() + this.suit.getPower());
    }
}
