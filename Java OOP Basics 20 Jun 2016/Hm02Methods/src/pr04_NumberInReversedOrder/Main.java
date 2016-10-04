package pr04_NumberInReversedOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String num = reader.readLine();

            DecimalNumber number = new DecimalNumber(num);

            number.printReversed();
        }
    }
}
