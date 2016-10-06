package pr07_DeckOfCards;

import pr07_DeckOfCards.enums.CardRank;
import pr07_DeckOfCards.enums.CardSuit;

public class Main {

    public static void main(String[] args) {

        for (CardSuit cardSuit : CardSuit.values()) {
            for (CardRank cardRank : CardRank.values()) {
                System.out.printf("%s of %s%n", cardRank.name(), cardSuit.name());
            }
        }
    }
}
