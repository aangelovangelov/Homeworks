package pr04_CardToString;

import pr04_CardToString.enums.CardRank;
import pr04_CardToString.enums.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CardRank rank = CardRank.valueOf(reader.readLine());
        CardSuit suit = CardSuit.valueOf(reader.readLine());

        Card card = new Card(rank, suit);

        System.out.println(card);
    }
}
