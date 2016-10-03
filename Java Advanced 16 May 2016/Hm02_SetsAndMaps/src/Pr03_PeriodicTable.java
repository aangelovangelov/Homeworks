import java.util.Scanner;
import java.util.TreeSet;

public class Pr03_PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();
        sc.nextLine();

        TreeSet<String> chemicalCompounds = new TreeSet<>();

        for (int i = 0; i < lineCount; i++) {
            String[] input = sc.nextLine().split("\\s+");
            for (int j = 0; j < input.length; j++) {
                String compound = input[j];
                chemicalCompounds.add(compound);
            }
        }

        for (String compound : chemicalCompounds) {
            System.out.print(compound + " ");
        }
    }
}
