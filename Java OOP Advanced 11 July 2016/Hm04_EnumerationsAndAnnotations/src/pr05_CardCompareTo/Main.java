package pr05_CardCompareTo;

import pr05_CardCompareTo.enums.CardRank;
import pr05_CardCompareTo.enums.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CardRank rank1 = CardRank.valueOf(reader.readLine());
        CardSuit suit1 = CardSuit.valueOf(reader.readLine());
        Card card1 = new Card(rank1, suit1);

        CardRank rank2 = CardRank.valueOf(reader.readLine());
        CardSuit suit2 = CardSuit.valueOf(reader.readLine());
        Card card2 = new Card(rank2, suit2);

        if (card1.compareTo(card2) >= 0) {
            System.out.println(card1);
        } else {
            System.out.println(card2);
        }
    }
}
