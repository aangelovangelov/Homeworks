import java.util.Scanner;

public class Pr06_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toUpperCase();
        String word = sc.nextLine().toUpperCase();

        int wordCounter = 0;
        int fromIndex = 0;
        while (true) {
            int wordIndex = line.indexOf(word, fromIndex);
            if (wordIndex < 0) {
                break;
            }

            wordCounter++;

            fromIndex = wordIndex + 1;
        }

        System.out.println(wordCounter);
    }
}
