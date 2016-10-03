import java.util.HashSet;
import java.util.Scanner;

public class Pr02_SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSetSize = sc.nextInt();
        int secondSetSize = sc.nextInt();

        HashSet<Integer> firstSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            int number = sc.nextInt();
            //if (!firstSet.contains(number)) {
            firstSet.add(number);
            //}
        }
        for (int i = 0; i < secondSetSize; i++) {
            int number = sc.nextInt();
            //if (!secondSet.contains(number)) {
            secondSet.add(number);
            //}
        }

        for (Integer numInFirstSet : firstSet) {
            for (Integer numInSecondSet : secondSet) {
                if (numInFirstSet == numInSecondSet) {
                    System.out.print(numInFirstSet + " ");
                }
            }
        }
    }
}
