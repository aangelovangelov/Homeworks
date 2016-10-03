import java.util.Scanner;

public class Pr07_SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bigger = sc.nextLine().trim();
        String smaller = sc.nextLine().trim();
        if (bigger.length() < smaller.length()) {
            String forChange = bigger;
            bigger = smaller;
            smaller = forChange;
        }

        StringBuilder result = new StringBuilder();
        int remainder = 0;
        int indexSmallNum = (bigger.length() - 1) - (bigger.length() - smaller.length());

        for (int i = bigger.length() - 1; i >= 0; i--) {
            char digitFromBig = bigger.charAt(i);
            char digitFromSmall = '0';

            if (indexSmallNum >= 0) {
                digitFromSmall = smaller.charAt(indexSmallNum);
            }

            if ('0' > digitFromBig || digitFromBig > '9') {
                continue;
            }
            if ('0' > digitFromSmall || digitFromSmall > '9') {
                indexSmallNum--;
                digitFromSmall = smaller.charAt(indexSmallNum);
            }

            int sum = (digitFromSmall - '0') + (digitFromBig - '0') + remainder;
            if (sum > 9) {
                result.insert(0, sum % 10);
                remainder = 1;
            } else {
                result.insert(0, sum);
                remainder = 0;
            }

            indexSmallNum--;
        }

        if (remainder == 1) {
            result.insert(0, 1);
        }

        while (true) {
            char firstDigit = result.charAt(0);
            if (firstDigit != '0') {
                break;
            }

            result.deleteCharAt(0);
        }

        System.out.println(result);
    }
}
