import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Pr13_Inferno {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] input = reader.readLine().split(" ");
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < input.length; i++) {
                numbers.add(Integer.parseInt(input[i]));
            }

            Map<String, ArrayList<Integer>> filters = new LinkedHashMap<>();

            while (true) {
                String line = reader.readLine();
                if ("Forge".equals(line)) {
                    break;
                }

                String[] inputs = line.split(";");
                String command = inputs[0];
                String filter = inputs[1];
                int param = Integer.parseInt(inputs[2]);

                if ("Exclude".equals(command)) {
                    if (! filters.containsKey(filter)) {
                        filters.put(filter, new ArrayList<>());
                        filters.get(filter).add(param);
                    } else {
                        if (! filters.get(filter).contains(param)) {
                            filters.get(filter).add(param);
                        }
                    }
                } else {
                    if (filters.containsKey(filter) && filters.get(filter).contains(param)) {
                        filters.get(filter).remove(new Integer(param));
                    }
                }
            }

            for (int i = 0; i < numbers.size(); i++) {
                int num = numbers.get(i);

                for (String key : filters.keySet()) {
                    for (Integer result : filters.get(key)) {
                        int leftNum = 0;
                        if (i != 0) {
                            leftNum = numbers.get(i - 1);
                        }
                        int rightNum = 0;
                        if (i != numbers.size() - 1) {
                            rightNum = numbers.get(i + 1);
                        }

                        Predicate<Integer> filter = filterBuilder(key, leftNum, rightNum, result);

                        if (filter.test(num)) {
                            numbers.remove(i);
                        }
                    }
                }
            }

            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }

    private static Predicate<Integer> filterBuilder(String operation, int leftNum, int rightNum, int result) {
        switch (operation) {
            case "Sum Left":
                return num -> leftNum + num == result;
            case "Sum Right":
                return num -> num + rightNum == result;
            case "Sum Left Right":
                return num -> leftNum + num + rightNum == result;
            default:
                return null;
        }
    }
}
