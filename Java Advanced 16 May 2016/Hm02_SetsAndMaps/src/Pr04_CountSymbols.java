import java.util.Scanner;
import java.util.TreeMap;

public class Pr04_CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<Character, Integer> symbolsCount = new TreeMap<>();

        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);

            if (!symbolsCount.containsKey(character)) {
                symbolsCount.put(character, 1);
                continue;
            }

            int oldValue = symbolsCount.get(character);
            int newValue = oldValue + 1;
            symbolsCount.put(character, newValue);
        }

        for (Character character : symbolsCount.keySet()) {
            System.out.printf("%c: %d time/s%n", character, symbolsCount.get(character));
        }
    }
}
