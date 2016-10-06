package pr03_CardsWithPower;

import pr03_CardsWithPower.enums.CardRank;
import pr03_CardsWithPower.enums.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CardRank rank = CardRank.valueOf(reader.readLine());
        CardSuit suit = CardSuit.valueOf(reader.readLine());

        System.out.printf("Card name: %s of %s; Card power: %d",
                rank.name(),
                suit.name(),
                rank.getPower() + suit.getPower());
    }
}
