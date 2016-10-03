import java.util.Locale;
import java.util.Scanner;

public class Problem08GetAverage {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));//(Locale.ROOT)
        Scanner scanner = new Scanner(System.in);

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double average = averageOfThreeNumbers(number1, number2, number3);

        System.out.printf("%.2f", average);

        scanner.close();
    }

    static double averageOfThreeNumbers(double num1, double num2, double num3){
        double average = (num1 + num2 + num3) / 3;
        return average;
    }
}
