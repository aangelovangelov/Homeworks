package pr08_CarTrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carInput = reader.readLine().split("\\s+");
        Double speed = Double.parseDouble(carInput[0]);
        Double fuel = Double.parseDouble(carInput[1]);
        Double fuelEconomy = Double.parseDouble(carInput[2]);
        Car car = new Car(speed, fuel, fuelEconomy);

        while (true) {
            String[] commands = reader.readLine().split("\\s+");
            if ("END".equals(commands[0])) {
                break;
            }
            car.executor(commands);
        }
    }
}
