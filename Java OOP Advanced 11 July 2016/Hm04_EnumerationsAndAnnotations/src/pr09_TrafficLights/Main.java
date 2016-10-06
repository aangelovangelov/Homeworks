package pr09_TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        int updateCount = Integer.parseInt(reader.readLine());
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            Signal signal = Signal.valueOf(input[i]);
            TrafficLight trafficLight = new TrafficLight(signal);
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < updateCount; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.printf("%s ", trafficLight.toString());
            }
            System.out.println();
        }
    }
}
