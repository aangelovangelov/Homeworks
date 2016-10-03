import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Pr05_FilterStudentsEmailDomain {
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
                    .filter(entry -> {
                        String e_mail = entry.getValue();
                        return e_mail.contains("@gmail.com");
                    })
                    .collect(Collectors.toMap(
                            entry -> entry.getKey(),
                            entry -> entry.getValue(),
                            (key, value) -> value,
                            LinkedHashMap::new));

            for (String name : students.keySet()) {
                System.out.println(name);
            }
        }
    }
}
