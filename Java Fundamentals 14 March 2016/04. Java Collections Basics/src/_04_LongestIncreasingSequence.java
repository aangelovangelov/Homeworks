import java.util.Scanner;

public class _04_LongestIncreasingSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputLine = sc.nextLine().split(" ");
        int[] numbers = new int[inputLine.length];
        for (int i = 0; i < inputLine.length; i++) {
            numbers[i] = Integer.parseInt(inputLine[i]);
        }

        int startIndex = 0;
        int countOfLongestSeq = 1;
        int currentStartIndex = 0;
        int currentCounter = 1;
        System.out.print(numbers[0] + " ");
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNum = numbers[i];
            int nextNum = numbers[i + 1];

            if (nextNum > currentNum) {
                currentCounter++;
                // This is for the output
                System.out.print(numbers[i + 1] + " ");
            } else {
                // This is for the next iteration
                currentCounter = 1;
                currentStartIndex = i + 1;
                // This is for the output
                System.out.println();
                System.out.print(numbers[i + 1] + " ");
            }

            if (currentCounter > countOfLongestSeq) {
                countOfLongestSeq = currentCounter;
                startIndex = currentStartIndex;
            }
        }
        System.out.println();
        System.out.print("Longest: ");
        for (int i = 0; i < countOfLongestSeq; i++) {
            System.out.print(numbers[startIndex + i] + " ");
        }

        sc.close();
    }
}
