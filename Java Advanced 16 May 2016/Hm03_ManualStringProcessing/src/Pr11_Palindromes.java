import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pr11_Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("[ .,?!]+");
        ArrayList<String> palindromes = new ArrayList<>();
        ArrayList<String> sortedPalindromes = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Check if the word is palindrom
            int lastIndex = word.length() - 1;
            boolean isPalindrom = true;
            for (int j = 0; j < word.length()/2 ; j++) {

                if (word.charAt(j) != word.charAt(lastIndex)) {
                    isPalindrom = false;
                }
                lastIndex--;
            }

            if (isPalindrom) {
                palindromes.add(word);
            }
        }

        // ArrayList of unique elements
        for (int i = 0; i < palindromes.size(); i++) {
            for (int j = i + 1; j < palindromes.size(); j++) {
                if (palindromes.get(i).equals(palindromes.get(j))) {
                    palindromes.remove(j);
                }
            }
        }

        Collections.sort(palindromes);

        Collator collator = Collator.getInstance();
        for (int i = 0; i < palindromes.size(); i++) {
            for (int j = 0; j < palindromes.size(); j++) {
                String pal1 = palindromes.get(i);
                String pal2 = palindromes.get(j);

                boolean isSecondSmaller = collator.compare(pal1, pal2) < 0;

                if (isSecondSmaller) {
                    String forChange = palindromes.get(i);
                    palindromes.set(i, palindromes.get(j));
                    palindromes.set(j, forChange);
                }
            }

        }

        System.out.println(palindromes);
    }

    public static boolean istPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
