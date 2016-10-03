import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pr10_GroupByGroup {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            //  name    group
            Map<String, Integer> studentsGroup = new LinkedHashMap<>();

            while (true) {
                String line = reader.readLine();
                if ("END".equals(line)) {
                    break;
                }

                String[] input = line.split("\\s+");
                String name = input[0] +" "+ input[1];
                int group = Integer.parseInt(input[2]);

                studentsGroup.put(name, group);
            }

            Map<Integer, List<Map.Entry<String, Integer>>> grouped = studentsGroup.entrySet().stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue));

            for (Integer group : grouped.keySet()) {
                System.out.print(group + " - ");
                String output = "";
                for (Map.Entry<String, Integer> entry : grouped.get(group)) {
                    output += entry.getKey() + ", ";
                }
                output = output.substring(0, output.length() - 2);
                System.out.println(output);
            }
        }
    }
}
