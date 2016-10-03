import java.util.Locale;
import java.util.Scanner;

public class _03FormattingNumbers {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        String strBin = Integer.toBinaryString(num1);

        long num1Bin = Integer.parseInt(strBin);

        System.out.printf("%1$-10X|%4$010d|%2$10.2f|%3$-10.3f%n", num1, num2, num3, num1Bin);

        sc.close();

    }
}
