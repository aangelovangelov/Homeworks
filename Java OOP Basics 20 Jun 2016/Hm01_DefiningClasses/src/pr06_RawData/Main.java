package pr06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lineCount = Integer.parseInt(reader.readLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < lineCount; i++) {
            String[] input = reader.readLine().split("\\s+");
            String model = input[0];
            double engineSpeed = Double.parseDouble(input[1]);
            double enginePower = Double.parseDouble(input[2]);
            double cargoWeight = Double.parseDouble(input[3]);
            String cargoType = input[4];
            //<Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>
            double tire1Pressure = Double.parseDouble(input[5]);
            double tire1Age = Double.parseDouble(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            double tire2Age = Double.parseDouble(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            double tire3Age = Double.parseDouble(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            double tire4Age = Double.parseDouble(input[12]);

            Tire tire1 = new Tire(tire1Pressure, tire1Age);
            Tire tire2 = new Tire(tire2Pressure, tire2Age);
            Tire tire3 = new Tire(tire3Pressure, tire3Age);
            Tire tire4 = new Tire(tire4Pressure, tire4Age);

            List<Tire> tires = new ArrayList<>();
            tires.add(tire1);
            tires.add(tire2);
            tires.add(tire3);
            tires.add(tire4);

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tires);

            cars.add(car);
        }

        String command = reader.readLine();

        if ("fragile".equals(command)) {

            cars.stream().filter(car -> {
                boolean isFragile = car.getCargoType().equals("fragile");

                List<Tire> tires = car.getTires().stream()
                        .filter(tire -> tire.getTirePressure() < 1)
                        .collect(Collectors.toList());

                if (isFragile && tires.size() != 0) {
                    return true;
                }
                return false;
            })
            .forEach(car -> System.out.println(car.getModel()));

        } else {

            cars.stream()
                    .filter(car -> car.getCargoType().equals("flamable") && car.getEnginePower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}
