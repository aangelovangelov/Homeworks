package pr05_CardCompareTo;

import pr05_CardCompareTo.enums.CardRank;
import pr05_CardCompareTo.enums.CardSuit;

public class Card implements Comparable<Card>{

    private CardRank rank;
    private CardSuit suit;
    private int power;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
        calculatePower();
    }

    public CardRank getRank() {
        return rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public int getPower() {
        return this.power;
    }

    private void calculatePower() {
        this.power = this.rank.getPower() + this.suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank.name(),
                this.suit.name(),
                this.power);
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.power, o.getPower());
    }
}
