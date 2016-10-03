import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Pr03_StudentsByAge {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            Map<String, Integer> people = new LinkedHashMap<>();

            while (true) {
                String line = reader.readLine();
                if ("END".equals(line)) {
                    break;
                }

                String[] input = line.split(" ");
                String name = input[0] +" "+ input[1];
                int age = Integer.valueOf(input[2]);

                people.put(name, age);
            }

            Predicate<Map.Entry<String, Integer>> myFilter = entry -> entry.getValue() >= 18 && entry.getValue() <= 24;

            people = people.entrySet().stream()
                    .filter(myFilter)
                    .collect(Collectors.toMap(
                            entry -> entry.getKey(),
                            entry -> entry.getValue(),
                            (key, value) -> value,
                            () -> new LinkedHashMap<String, Integer>()));

            for (String person : people.keySet()) {
                System.out.println(person +" "+ people.get(person));
            }
        }
    }
}
