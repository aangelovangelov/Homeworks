import java.math.BigInteger;
import java.util.Scanner;

public class Pr04_ConvertFromBase10ToBaseN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger base = new BigInteger(sc.next());
        BigInteger number = new BigInteger(sc.next());

        StringBuilder output = new StringBuilder();
        while (number.compareTo(BigInteger.ZERO) > 0) {

            output.insert(0, number.mod(base));
            //output.append(number.mod(base));

            number = number.divide(base);
        }
        System.out.println(output);
    }
}
