import java.math.BigInteger;
import java.util.Scanner;

public class Pr05_ConvertFromBaseNToBase10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        String num = sc.next();
        int numLenght = num.length();
        BigInteger numberInBase = new BigInteger(num);
        BigInteger decimalBaseNumber = BigInteger.ZERO;

        BigInteger delimiter = BigInteger.ONE;
        for (int i = 0; i < numLenght; i++) {
            BigInteger digit = numberInBase.divide(delimiter).mod(BigInteger.TEN);

            decimalBaseNumber = decimalBaseNumber.add(
                    digit.multiply(BigInteger.valueOf(base).pow(i)));

            delimiter = delimiter.multiply(BigInteger.TEN);
        }

        System.out.println(decimalBaseNumber);
    }
}
