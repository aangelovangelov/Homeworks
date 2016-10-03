import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Pr06_FilterStudentsByPhone {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //  name    e-mail
            Map<String, String> students = new LinkedHashMap<>();

            while (true) {
                String line = reader.readLine();
                if ("END".equals(line)) {
                    break;
                }

                String[] input = line.split("\\s+");
                String name = input[0] + " " + input[1];
                String e_mail = input[2];

                students.put(name, e_mail);
            }

            students = students.entrySet().stream()
                    .filter(entry -> entry.getValue().startsWith("02") || entry.getValue().startsWith("+3592"))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (key, value) -> value,
                            LinkedHashMap::new));

            for (String name : students.keySet()) {
                System.out.println(name);
            }
        }
    }
}
