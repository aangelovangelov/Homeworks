package pr03_LastDigitName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int inputNumber = Integer.parseInt(reader.readLine());

            Number number = new Number(inputNumber);

            System.out.println(number.getLastDigitName());
        }
    }
}
