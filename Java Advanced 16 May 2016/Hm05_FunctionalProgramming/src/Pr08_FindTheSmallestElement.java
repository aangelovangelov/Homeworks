import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pr08_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        List<Integer> numbers = Arrays.asList(input)
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestNumber = list -> {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            return min;
        };

        int minNum = smallestNumber.apply(numbers);

        int index = 0;
        for (int i = numbers.indexOf(minNum); i < numbers.size() - 1; i++) {
            int currNum = numbers.get(i);
            int nextNum = numbers.get(i + 1);

            if (nextNum <= currNum) {
                break;
            }
            index++;
        }

        System.out.println(numbers.lastIndexOf(minNum));
    }
}
