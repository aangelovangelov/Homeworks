import java.util.*;

public class _08_ExtractAllUniqueWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().toLowerCase().split("\\W+");
        ArrayList<String> wordsList = new ArrayList<>();
        // Copy array in list/array
//        for (int i = 0; i < words.length; i++) {
//            wordsList.add(words[i]);
//        }
//        List<String> wordList = Arrays.asList(words); - fast initialization
        //ArrayList<Integer> fastWei = new ArrayList<>(Arrays.asList(3, 4, 5));
        //List<Integer> fastWei1 = Arrays.asList(3, 4 ,5);

        for (int i = 0; i < words.length; i++) {
            if (!wordsList.contains(words[i])) {
                wordsList.add(words[i]);
            }
        }

        Collections.sort(wordsList);

        for (String word : wordsList) {
            System.out.print(word + " ");
        }

        TreeSet<String> wordSet = new TreeSet<>();
        for (int i = 0; i < words.length; i++) {
            wordSet.add(words[i]);
        }
        System.out.println(wordSet);
        sc.close();
    }
}
