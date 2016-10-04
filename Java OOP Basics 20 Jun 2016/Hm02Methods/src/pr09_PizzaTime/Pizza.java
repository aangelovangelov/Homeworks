package pr09_PizzaTime;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Pizza {

    private String name;
    private Integer group;

    public Pizza(String name, Integer group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Integer getGroup() {
        return group;
    }

    public static Map<Integer, List<Pizza>> createCollection(String... strings) {

        Map<Integer, List<Pizza>> pizzaCollection = new HashMap<>();

        String regex = "(?<number>[0-9]+)(?<name>[a-zA-Z0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        for (String string : strings) {

            Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                Integer pizzaNumber = Integer.parseInt(matcher.group(1));
                String pizzaName = matcher.group(2);

                if (!pizzaCollection.containsKey(pizzaNumber)) {
                    pizzaCollection.put(pizzaNumber, new ArrayList<>());
                }

                pizzaCollection.get(pizzaNumber).add(new Pizza(pizzaName, pizzaNumber));
            }
        }

        Map<Integer, List<Pizza>> sortedCollection = pizzaCollection.entrySet().stream()
                .sorted((p1, p2) -> p1.getKey().compareTo(p2.getKey()))
                .collect(Collectors.toMap(
                        pizza -> pizza.getKey(),
                        pizza -> pizza.getValue(),
                        (key, value) -> value,
                        LinkedHashMap::new));

        return sortedCollection;
    }
}
