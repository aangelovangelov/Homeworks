package pr07_CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int engineCount = Integer.parseInt(reader.readLine());
        List<Engine> engines = new ArrayList<>();

        for (int i = 0; i < engineCount; i++) {
            String[] input = reader.readLine().split("\\s+");
            String engineModel = input[0];
            int enginePower = Integer.parseInt(input[1]);

            Engine engine = null;
            if (input.length == 2) {
                engine = new Engine(engineModel, enginePower);
            } else if (input.length == 3) {
                String thirdElement = input[2];
                if (isThirdInteger(thirdElement)) {
                    int displacement = Integer.parseInt(thirdElement);
                    engine = new Engine(engineModel, enginePower, displacement);
                } else {
                    engine = new Engine(engineModel, enginePower, thirdElement);
                }
            } else {//input.length == 4
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(engineModel, enginePower, displacement, efficiency);
            }

            engines.add(engine);
        }

        int carCount = Integer.parseInt(reader.readLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carCount; i++) {
            String[] input = reader.readLine().split("\\s+");
            String carModel = input[0];
            List<Engine> engs = engines.stream()
                    .filter(engine -> engine.getModel().equals(input[1]))
                    .collect(Collectors.toList());
            Engine carEngine = engs.get(0);

            Car car = null;
            if (input.length == 2) {
                car = new Car(carModel, carEngine);
            } else if (input.length == 3) {
                if (isThirdInteger(input[2])) {
                    int weight = Integer.parseInt(input[2]);
                    car = new Car(carModel, carEngine, weight);
                } else {
                    car = new Car(carModel, carEngine, input[2]);
                }
            } else {//input.length == 4
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                car = new Car(carModel, carEngine, weight, color);
            }

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car);
        }

    }

    private static boolean isThirdInteger(String thirdElement) {
        try {
            int number = Integer.parseInt(thirdElement);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
