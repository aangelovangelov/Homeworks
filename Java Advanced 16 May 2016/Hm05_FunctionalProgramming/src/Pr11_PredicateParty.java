import java.util.*;
import java.util.function.Predicate;

public class Pr11_PredicateParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        List<String> names = new ArrayList<>(Arrays.asList(input));

        if (names.size() != 0 && "".equals(names.get(0))) {
            System.out.println("Nobody is going to the party!");
            return;
        }

        while (true) {
            String line = sc.nextLine();
            if ("Party!".equals(line)) {
                break;
            }

            String[] inputs = line.split("\\s+");
            String operaton = inputs[0];
            String comand = inputs[1];
            String checker = inputs[2];

            Predicate<String> filter = filterBuilder(comand, checker);

            List<String> newNames = new LinkedList<>();

            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);

                if ("Remove".equals(operaton)) {
                    if (!filter.test(name)) {
                        newNames.add(name);
                    }
                } else {
                    if (filter.test(name)) {
                        newNames.add(name);
                        newNames.add(name);
                    } else {
                        newNames.add(name);
                    }
                }
            }

            names = newNames;
        }

        if (names.size() > 0) {
            System.out.println(String.join(", ", names) + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }

    private static Predicate<String> filterBuilder(String comand, String checker) {
        switch (comand) {
            case "StartsWith":
                return name -> name.startsWith(checker);
            case "EndsWith":
                return name -> name.endsWith(checker);
            case "Length":
                return name -> name.length() == Integer.parseInt(checker);
            default:
                return null;
        }
    }
}
