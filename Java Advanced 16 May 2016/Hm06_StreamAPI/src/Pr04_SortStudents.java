import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pr04_SortStudents {
    public static void main(String[] args) throws IOException {
        List<String> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String name = reader.readLine();
                if ("END".equals(name)) {
                    break;
                }
                students.add(name);
            }

            students = students.stream()
                    .sorted((name1, name2) -> {
                        String[] names1 = name1.split(" ");
                        String[] names2 = name2.split(" ");
                        String firstName1 = names1[0];
                        String lastName1 = names1[1];
                        String firstName2 = names2[0];
                        String lastName2 = names2[1];


                        if (lastName1.compareTo(lastName2) == 0) {
                            return firstName2.compareTo(firstName1);
                        }

                        return lastName1.compareTo(lastName2);

                    }).collect(Collectors.toList());

            for (String student : students) {
                System.out.println(student);
            }
        }
    }
}
