import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Pr10_ListOfPredicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRange = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split("\\s+");
        int[] dividers = Arrays.asList(input).stream().mapToInt(Integer::parseInt).toArray();

        ArrayList<Predicate<Integer>> checker = new ArrayList<>();

        for (int i = 0; i < dividers.length; i++) {
            int divider = dividers[i];
            checker.add(num -> num % divider == 0);
        }

        for (int i = 1; i <= numRange; i++) {
            int number = i;

            boolean canBeDivided = true;
            for (int j = 0; j < checker.size(); j++) {
                if (! checker.get(j).test(number)) {
                    canBeDivided = false;
                    break;
                }
            }

            if (canBeDivided) {
                System.out.print(number + " ");
            }
        }
    }
}
