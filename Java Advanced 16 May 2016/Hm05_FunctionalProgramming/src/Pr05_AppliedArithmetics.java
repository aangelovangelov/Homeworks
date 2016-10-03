import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Pr05_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.asList(sc.nextLine().split("\\s+")).stream().mapToInt(Integer::parseInt).toArray();

        Consumer<int[]> printer = array -> {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        };

        while (true) {
            String comand = sc.nextLine();
            if ("end".equals(comand)) {
                break;
            }

            numbers = numberOperations(numbers, functionBuilder(comand));

            if ("print".equals(comand)) {
                printer.accept(numbers);
            }
        }
    }

    public static Function<Integer, Integer> functionBuilder(String comand) {
        switch (comand) {
            case "add":
                return num -> num + 1;
            case "multiply":
                return num -> num * 2;
            case "subtract":
                return num -> num - 1;
            case "print":
                return num -> num;
            default:
                return null;
        }
    }

    public static int[] numberOperations(int[] numbers, Function<Integer, Integer> operation) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = operation.apply(numbers[i]);
        }
        return numbers;
    }
}
