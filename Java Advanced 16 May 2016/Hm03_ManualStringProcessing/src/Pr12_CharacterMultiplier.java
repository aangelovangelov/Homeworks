import java.util.Scanner;

public class Pr12_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        String longesttWord = words[0];
        String smallerWord = words[1];
        if (longesttWord.length() < smallerWord.length()) {
            String forChange = longesttWord;
            longesttWord = smallerWord;
            smallerWord = forChange;
        }

        long sum = 0;
        for (int i = 0; i < longesttWord.length(); i++) {
            char longestChar = longesttWord.charAt(i);
            char smallerChar = '1' - '0';

            if (i < smallerWord.length()) {
                smallerChar = smallerWord.charAt(i);
            }

            sum += longestChar * smallerChar;
        }

        System.out.println(sum);
    }
}
