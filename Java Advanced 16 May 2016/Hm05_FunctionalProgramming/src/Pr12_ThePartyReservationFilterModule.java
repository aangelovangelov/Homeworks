import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Pr12_ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        LinkedList<String> names = new LinkedList<>(Arrays.asList(input));
        HashMap<String, LinkedList<String>> filters = new HashMap<>();

        while (true) {
            String line = sc.nextLine();
            if ("Print".equals(line)) {
                break;
            }

            String[] inputs = line.split(";");
            String command = inputs[0];
            String filterType = inputs[1];
            String filterParameter = inputs[2];

            if ("Add filter".equals(command)) {
                if (!filters.containsKey(filterType)) {
                    filters.put(filterType, new LinkedList<>());
                    filters.get(filterType).add(filterParameter);
                } else {
                    if (! filters.get(filterType).contains(filterParameter)) {
                        filters.get(filterType).add(filterParameter);
                    }
                }
            } else {
                if (filters.containsKey(filterType) && filters.get(filterType).contains(filterParameter)) {
                    filters.get(filterType).remove(filterParameter);
                }
            }

        }

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            boolean isValidName = true;
            for (String key : filters.keySet()) {
                for (String value : filters.get(key)) {
                    Predicate<String> filter = filterTypeBuilder(key, value);

                    if (filter.test(name)) {
                        isValidName = false;
                    }
                }
            }

            if (isValidName) {
                System.out.print(name + " ");
            }
        }
    }

    private static Predicate<String> filterTypeBuilder(String filterType, String filterParameter) {
        switch (filterType) {
            case "Starts with":
                return name -> name.startsWith(filterParameter);
            case "Ends with":
                return name -> name.endsWith(filterParameter);
            case "Contains":
                return name -> name.contains(filterParameter);
            case "Length":
                return name -> name.length() == Integer.parseInt(filterParameter);
            default:
                return null;
        }
    }
}
