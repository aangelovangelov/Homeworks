import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Pr01_StudentsByGroup {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //  name    group
            Map<String, Integer> students = new HashMap<>();

            while (true) {
                String line = reader.readLine();
                if ("END".equals(line)) {
                    break;
                }

                String[] input = line.split("\\s+");
                String name = input[0] + " " + input[1];
                int group = Integer.valueOf(input[2]);

                students.put(name, group);
            }

            students = students.entrySet().stream()
                    .filter(entry -> entry.getValue() == 2)
                    .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                    .collect(Collectors.toMap(
                            entry -> entry.getKey(),
                            entry -> entry.getValue(),
                            (key, value) -> value,
                            LinkedHashMap<String, Integer>::new));

            for (String name : students.keySet()) {
                System.out.println(name);
            }
        }
    }
}
