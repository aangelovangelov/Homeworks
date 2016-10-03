import java.util.Scanner;

public class Pr14_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");

        double totalSum = 0;

        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            double number = Double.parseDouble(word.substring(1, word.length() - 1));

            if (Character.isUpperCase(firstChar)) {
                number /= (firstChar - 64);
            } else {
                number *= (firstChar - 96);
            }

            if (Character.isUpperCase(lastChar)) {
                number -= (lastChar - 64);
            } else {
                number += (lastChar - 96);
            }

            totalSum += number;
        }

        System.out.printf("%.2f", totalSum);
    }
}
