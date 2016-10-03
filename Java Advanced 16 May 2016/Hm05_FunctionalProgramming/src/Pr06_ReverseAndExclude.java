import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Pr06_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.asList(sc.nextLine().split("\\s+")).stream().mapToInt(Integer::parseInt).toArray();

        int divisibleBy = sc.nextInt();

        Consumer<ArrayList<Integer>> printer = list -> {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        };

        Predicate<Integer> filterCondition = filterConditionBuilder("divide", divisibleBy);

        ArrayList<Integer> filteredNUms = filter(numbers, filterCondition);

        ArrayList<Integer> reversedNums = reverse(filteredNUms);

        printer.accept(reversedNums);
    }

    private static Predicate<Integer> filterConditionBuilder(String operation, int number) {
        switch (operation) {
            case "divide":
                return num -> num % number != 0;
            default:
                return null;
        }
    }

    private static ArrayList<Integer> filter(int[] numbers, Predicate<Integer> filterCondition) {
        ArrayList<Integer> filteredNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (filterCondition.test(numbers[i])) {
                filteredNumbers.add(numbers[i]);
            }
        }
        return filteredNumbers;
    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> numbers) {
        for (int i = 0, j = numbers.size() - 1; i < numbers.size() / 2; i++, j--) {
            numbers.set(i, numbers.get(i) + numbers.get(j));
            numbers.set(j, numbers.get(i) - numbers.get(j));
            numbers.set(i, numbers.get(i) - numbers.get(j));
        }
        return numbers;
    }
}
