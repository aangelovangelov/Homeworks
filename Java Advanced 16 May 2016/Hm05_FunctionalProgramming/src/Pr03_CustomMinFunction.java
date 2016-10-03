import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Pr03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] numbers = Arrays.asList(line.split("\\s+")).
                stream().
                mapToInt(Integer::parseInt).
                toArray();

        Function<int[], Integer> minNumber = array -> {
            int minNum = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {

                BiPredicate<Integer, Integer> isSmaller = (arrNum, min) -> arrNum < (min);

                if (isSmaller.test(array[i], minNum)) {
                    minNum = array[i];
                }
            }
            return minNum;
        };

        int minNum = minNumber.apply(numbers);

        System.out.println(minNum);
    }
}
