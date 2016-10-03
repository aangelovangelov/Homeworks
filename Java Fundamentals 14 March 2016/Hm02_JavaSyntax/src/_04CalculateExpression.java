import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class _04CalculateExpression {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        double numberA = scanner.nextDouble();
        double numberB = scanner.nextDouble();
        double numberC = scanner.nextDouble();

        double firstFormula = Math.pow(((Math.pow(numberA, 2) + Math.pow(numberB, 2)) / (Math.pow(numberA, 2) - Math.pow(numberB, 2))),
                (numberA + numberB + numberC) / Math.sqrt(numberC));

        double secondFormula = Math.pow((numberA*numberA + numberB*numberB - numberC*numberC*numberC), (numberA - numberB));

        double averageNumbers = (numberA + numberB + numberC) / 3;
        double averageFormulas = (firstFormula + secondFormula) / 2;
        double difference = Math.abs(averageNumbers - averageFormulas);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormula, secondFormula, difference);

        scanner.close();
    }
}
