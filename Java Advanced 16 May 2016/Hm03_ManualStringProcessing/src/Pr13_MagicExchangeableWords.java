import java.util.HashMap;
import java.util.Scanner;

public class Pr13_MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String smallerString = sc.next();
        String biggerString = sc.next();
        if (smallerString.length() > biggerString.length()) {
            String forChange = smallerString;
            smallerString = biggerString;
            biggerString = forChange;
        }
        boolean areExchengeable = true;

        HashMap<Character, Character> exchangeables = new HashMap<>();

        for (int i = 0; i < smallerString.length(); i++) {
            char keyChar = biggerString.charAt(i);
            char valueChar = smallerString.charAt(i);

            if (!exchangeables.containsKey(keyChar) && !exchangeables.containsValue(valueChar)) {
                exchangeables.put(keyChar, valueChar);
            }

            if (!exchangeables.containsKey(keyChar) && exchangeables.containsValue(valueChar)) {
                areExchengeable = false;
            }

            if (exchangeables.containsKey(keyChar) && !exchangeables.containsValue(valueChar)) {
                areExchengeable = false;
            }
        }

        for (int i = 0; i < biggerString.length(); i++) {
            char keyChar = biggerString.charAt(i);

            if (!exchangeables.containsKey(keyChar)) {
                areExchengeable = false;
            }
        }

        System.out.println(areExchengeable);
    }
}
