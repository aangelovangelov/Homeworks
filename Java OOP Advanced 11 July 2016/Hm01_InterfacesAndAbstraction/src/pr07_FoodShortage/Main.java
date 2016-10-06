package pr07_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, PersonImpl> people = new HashMap<>();

        int lineCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lineCount; i++) {

            String[] input = reader.readLine().split("\\s+");

            if (input.length == 4) {
                Citizen citizen = new Citizen(
                        input[0],
                        Integer.parseInt(input[1]),
                        input[2], input[3]);

                people.put(input[0], citizen);
            } else {
                Rebel rebel = new Rebel(
                        input[0],
                        Integer.parseInt(input[1]),
                        input[2]);

                people.put(input[0], rebel);
            }
        }

        while (true) {
            String name = reader.readLine();
            if ("End".equals(name)) {
                break;
            }

             people.values().stream()
                     .forEach(person -> {
                         if (person.getName().equals(name)) {
                             person.buyFood();
                         }
                     });
        }

        System.out.println(people.values().stream()
                .mapToInt(PersonImpl::getFood)
                .sum());
    }
}
