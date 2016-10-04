package pr08_ShapesVolume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if ("End".equals(input[0])) {
                break;
            }

            Double[] values = Arrays.stream(input)
                    .skip(1)
                    .map(Double::parseDouble)
                    .toArray(Double[]::new);

            switch (input[0]) {
                case "Cube":
                    System.out.printf("%.3f%n", VolumeCalculator.volume(new Cube(values[0])));
                    break;
                case "Cylinder":
                    System.out.printf("%.3f%n", VolumeCalculator.volume(new Cylinder(values[0], values[1])));
                    break;
                case "TrianglePrism":
                    System.out.printf("%.3f%n", VolumeCalculator.volume(new TriangularPrism(values[0], values[1], values[2])));
                    break;
                default:
                    break;
            }
        }
    }
}
