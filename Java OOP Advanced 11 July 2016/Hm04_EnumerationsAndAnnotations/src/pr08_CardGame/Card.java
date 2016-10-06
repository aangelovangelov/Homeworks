package pr08_CardGame;

import pr08_CardGame.enums.Rank;
import pr08_CardGame.enums.Suit;

public class Card implements Comparable<Card> {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getName() {
        return String.format("%s of %s", this.rank.name(), this.suit.name());
    }

    public int getPower() {
        return this.rank.getPower() + this.suit.getPower();
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getPower(), o.getPower());
    }
}
