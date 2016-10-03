import java.util.Scanner;
import java.util.function.Predicate;

public class Pr07_PredicateForNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biggestLenght = sc.nextInt();
        sc.nextLine();
        String[] names = sc.nextLine().split("\\s+");

        Predicate<String> validName = name -> name.length() <= biggestLenght;

        printSmallerNames(names, validName);
    }

    public static void printSmallerNames(String[] names, Predicate<String> validation) {
        for (int i = 0; i < names.length; i++) {
            if (validation.test(names[i])) {
                System.out.println(names[i]);
            }
        }
    }
}
