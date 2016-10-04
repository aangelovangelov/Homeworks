package pr03_TemperatureConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("End")) {
                break;
            }
            
            Temperature temperature = new Temperature(input[1], Integer.parseInt(input[0]));

            if (input[1].equals("Celsius")) {
                System.out.printf("%.2f Fahrenheit", Temperature.toFahrenheit());
            } else {
                System.out.printf("%.2f Celsius", Temperature.toCelsius());
            }
            System.out.println();
        }
    }
}
