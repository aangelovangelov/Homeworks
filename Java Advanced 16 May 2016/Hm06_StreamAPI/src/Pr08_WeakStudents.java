import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pr08_WeakStudents {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            Map<String, List<Integer>> studentsMarks = new LinkedHashMap<>();

            while (true) {
                String line = reader.readLine();
                if ("END".equals(line)) {
                    break;
                }

                String[] input = line.split("\\s+");
                String name = input[0] + " " + input[1];

                List<Integer> marks = new ArrayList<>();
                for (int i = 2; i < input.length; i++) {
                    marks.add(Integer.parseInt(input[i]));
                }

                studentsMarks.put(name, marks);
            }

            studentsMarks = studentsMarks.entrySet().stream()
                    //.peek(entry -> System.out.println(entry.getValue()))
                    .filter(entry -> {
                        int marksUnder4 = 0;
                        List<Integer> marks = entry.getValue();
                        for (int i = 0; i < marks.size(); i++) {
                            if (marks.get(i) < 4) {
                                marksUnder4++;
                            }
                        }

                        return marksUnder4 >= 2;
                    })
                    //.peek(entry -> System.out.println(entry.getValue()))
                    .collect(Collectors.toMap(
                            entry -> entry.getKey(),
                            entry -> entry.getValue(),
                            (key, value) -> value,
                            LinkedHashMap::new));

            for (String name : studentsMarks.keySet()) {
                System.out.println(name);
            }
        }
    }
}
