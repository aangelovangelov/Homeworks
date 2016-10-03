import java.util.*;

public class _10_CardsFrequencies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cards = sc.nextLine().split("\\W+");

        LinkedHashMap<String, Double> cardCounter = new LinkedHashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if (!cardCounter.containsKey(cards[i])) {
                cardCounter.put(cards[i], 1d);
            } else {
                cardCounter.put(cards[i], cardCounter.get(cards[i]) + 1);
            }
        }
        double cardsInTheDeck = cards.length;

        for (Map.Entry<String, Double> entry : cardCounter.entrySet()) {
            String card = entry.getKey();
            Double resultPercent = (entry.getValue() / cardsInTheDeck) * 100;
            System.out.printf("%s -> %.2f%%", card, resultPercent);
            System.out.println();
        }


        sc.close();
    }
}
