package pr07_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if ("End".equals(input[0])) {
                break;
            }

            String matOperation = input[0];
            Double firstNum = Double.parseDouble(input[1]);
            Double secondNum = Double.parseDouble(input[2]);

            switch (matOperation) {
                case "Sum":
                    System.out.printf("%.2f%n", MathUtil.sum(firstNum, secondNum));
                    break;
                case "Multiply":
                    System.out.printf("%.2f%n", MathUtil.multiply(firstNum, secondNum));
                    break;
                case "Percentage":
                    System.out.printf("%.2f%n", MathUtil.percentage(firstNum, secondNum));
                    break;
                case "Divide":
                    System.out.printf("%.2f%n", MathUtil.divide(firstNum, secondNum));
                    break;
                case "Subtract":
                    System.out.printf("%.2f%n", MathUtil.subtract(firstNum, secondNum));
                    break;
                default:
                    break;
            }
        }
    }
}
