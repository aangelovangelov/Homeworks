import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pr02_StudentsByFirstLastName {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> students = new ArrayList<>();

            while (true) {
                String line = reader.readLine();
                if ("END".equals(line)) {
                    break;
                }
                students.add(line);
            }

            students = students.stream()
                    .filter(name -> {
                        String[] names = name.split(" ");
                        String firstName = names[0];
                        String lastName = names[1];

                        return firstName.compareTo(lastName) < 0;
                    }).collect(Collectors.toList());

            for (String student : students) {
                System.out.println(student);
            }
        }
    }
}
