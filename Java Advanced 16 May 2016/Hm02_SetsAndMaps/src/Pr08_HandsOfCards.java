import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pr08_HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] checkingPower = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] checkingType = {"*", "C", "D", "H", "S"};

        //            person          cards
        LinkedHashMap<String, HashSet<String>> cardsHand = new LinkedHashMap<>();

        String line = sc.nextLine();
        while (!"JOKER".equals(line)) {
            String[] input = line.split(": ");
            String name = input[0];
            String[] cardsArr = input[1].split(", ");

            if (!cardsHand.containsKey(name)) {
                cardsHand.put(name, new HashSet<>());
            }

            for (int i = 0; i < cardsArr.length; i++) {
                String card = cardsArr[i].trim();
                cardsHand.get(name).add(card);
            }
            line = sc.nextLine();
        }

        for (String person : cardsHand.keySet()) {
            System.out.print(person + ": ");

            HashSet<String> hand = cardsHand.get(person);

            int sum = 0;
            for (String card : hand) {
                String power = card.substring(0, card.length() - 1);
                String type = card.substring(card.length() - 1);
                for (int i = 0; i < checkingPower.length; i++) {
                    for (int j = 0; j < checkingType.length; j++) {
                        if (checkingPower[i].equals(power) && checkingType[j].equals(type)) {
                            sum += i * j;
                            break;
                        }
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
