import java.util.Scanner;

public class _05DecimalToBase7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String decimalToBase7 = Integer.toString(number, 7);

        System.out.println(decimalToBase7);

        scanner.close();
    }
}
