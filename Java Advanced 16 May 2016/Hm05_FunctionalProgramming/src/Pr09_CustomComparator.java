import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Pr09_CustomComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        Integer[] numbers = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Comparator<Integer> evenFirst = (a, b) -> {
            int index = 0;
            if (a % 2 == 0 && b % 2 != 0) {
                index = -1;
            } else if (b % 2 == 0 && a % 2 != 0) {
                index = 1;
            } else {//return 0 - they are equals
                if (a <= b) {
                    index = -1;
                } else {
                    index = 1;
                }
            }
            return index;
        };


        Arrays.sort(numbers, evenFirst);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
