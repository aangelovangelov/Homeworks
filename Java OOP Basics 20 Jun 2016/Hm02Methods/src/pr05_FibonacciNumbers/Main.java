package pr05_FibonacciNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int starPositin = Integer.parseInt(reader.readLine());
            int endPositin = Integer.parseInt(reader.readLine());

            Fibonacci fibNumbers = new Fibonacci(endPositin);

            List<Long> fibonacciInRange = fibNumbers.getNumbersInRange(starPositin, endPositin);

            String forPrinting = fibonacciInRange.toString();

            System.out.println(forPrinting.substring(1, forPrinting.length() - 1));
        }
    }
}
