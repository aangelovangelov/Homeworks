package pr05_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int carCount = Integer.parseInt(reader.readLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carCount; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelCost = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelCost);

            cars.add(car);
        }

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("End")) {
                break;
            }
            String model = input[1];
            double distance = Double.parseDouble(input[2]);

            cars.stream()
                    .filter(car -> car.getModel().equals(model))
                    .forEach(car -> car.calculateTotalDistance(distance));
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
