import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr08_MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine().trim();
        int multiplayer = reader.read() - '0';

        StringBuilder result = new StringBuilder();
        int remainder = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);

            int product = multiplayer * (digit - '0') + remainder;

            result.insert(0, product % 10);
            remainder = product / 10;
        }

        if (remainder != 0) {
            result.insert(0, remainder);
        }

        while (true) {
            char firstDigit = result.charAt(0);
            if (firstDigit != '0' || result.length() == 1) {
                break;
            }

            result.deleteCharAt(0);
        }

        System.out.println(result);
    }
}
