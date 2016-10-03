import java.util.*;

public class _09_MostFrequentWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] wordsArr = sc.nextLine().toLowerCase().split("\\W+");
        // Put the words in the TreeMap and count them - override with new values. He order them.
        TreeMap<String, Integer> wordsMap = new TreeMap<>();
        for (int i = 0; i < wordsArr.length; i++) {
            if (!wordsMap.containsKey(wordsArr[i])) {
                wordsMap.put(wordsArr[i], 1);
            } else {
                //wordsMap.replace(wordsArr[i], wordsMap.get(wordsArr[i]), wordsMap.get(wordsArr[i]) + 1);
                wordsMap.put(wordsArr[i], wordsMap.get(wordsArr[i]) + 1);
            }
        }
        // Finding the count of the repetition of the most frequent word/words
        int maxConted = 0;
        for (Integer value : wordsMap.values()) {
            if (value > maxConted) {
                maxConted = value;
            }
        }
        // See who are the words with max counter and print them
        for (String key : wordsMap.keySet()) {
            if (wordsMap.get(key) == maxConted) {
                System.out.printf("%s -> %d times%", key, maxConted);
                System.out.println();
            }
        }

        sc.close();
    }
}
