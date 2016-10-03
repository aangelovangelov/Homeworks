import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pr09_StudentsEnrolledIn2014Or2015 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            //  name         marks
            Map<String, List<Integer>> studentsMarks = new LinkedHashMap<>();

            while (true) {
                String line = reader.readLine();
                if ("END".equals(line)) {
                    break;
                }

                String[] input = line.split("\\s+");
                String id = input[0];
                List<Integer> marks = new ArrayList<>();
                for (int i = 1; i < input.length; i++) {
                    marks.add(Integer.parseInt(input[i]));
                }

                studentsMarks.put(id, marks);
            }

            studentsMarks = studentsMarks.entrySet().stream()
                    .filter(entry -> entry.getKey().endsWith("14") || entry.getKey().endsWith("15"))
                    .collect(Collectors.toMap(
                            entry -> entry.getKey(),
                            entry -> entry.getValue(),
                            (key, value) -> value,
                            LinkedHashMap::new));

            for (List<Integer> marks : studentsMarks.values()) {
                for (Integer mark : marks) {
                    System.out.print(mark + " ");
                }
                System.out.println();
            }
        }
    }
}
