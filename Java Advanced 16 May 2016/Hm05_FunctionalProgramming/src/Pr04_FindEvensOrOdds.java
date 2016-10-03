import java.util.Scanner;
import java.util.function.Predicate;

public class Pr04_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerBound = sc.nextInt();
        int upperBound = sc.nextInt();
        sc.nextLine();

        String comand = sc.nextLine();

        Predicate<Integer> condition = predicateBuilder(comand);

        filterNumbers(lowerBound, upperBound, condition);
    }

    public static Predicate<Integer> predicateBuilder(String comand) {
        switch (comand) {
            case "odd":
                return num -> num % 2 != 0;
            case "even":
                return num -> num % 2 == 0;
            default:
                return null;
        }
    }

    public static void filterNumbers(int fromNum, int toNum, Predicate<Integer> condition) {
        for (int number = fromNum; number <= toNum; number++) {
            if (condition.test(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
