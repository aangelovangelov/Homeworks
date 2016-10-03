import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr12_LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //      items    points
        TreeMap<String, Integer> legendaryItems = new TreeMap<>();
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);
        legendaryItems.put("shards", 0);

        //      items    points
        TreeMap<String, Integer> junkItems = new TreeMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if ("".equals(line)) {
                break;
            }

            String[] input = line.split(" ");
            String[] items = new String[input.length / 2];
            int[] points = new int[input.length / 2];
            for (int i = 0; i < input.length; i++) {
                if (i % 2 == 0) {
                    points[i / 2] = Integer.parseInt(input[i]);
                } else {
                    items[i / 2] = input[i];
                }
            }

            for (int i = 0; i < items.length; i++) {
                String item = items[i].toLowerCase();
                int point = points[i];

                boolean isLegendary = "motes".equals(item) || "fragments".equals(item) || "shards".equals(item);

                if (isLegendary) {
                    int oldPoints = legendaryItems.get(item);
                    int newPoints = oldPoints + point;
                    legendaryItems.put(item, newPoints);
                    if (newPoints >= 250) {//printing

                        legendaryItems.put(item, newPoints - 250);

                        if ("fragments".equals(item)) {
                            System.out.println("Valanyr obtained!");
                        } else if ("motes".equals(item)) {
                            System.out.println("Dragonwrath obtained!");
                        } else {
                            System.out.println("Shadowmourne obtained!");
                        }

                        legendaryItems.entrySet().stream()
                                .sorted((entry1, entry2) -> {
                                    return entry2.getValue().compareTo(entry1.getValue());
                                }).forEach(entry -> {
                            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
                        });

                        for (Map.Entry<String, Integer> junkItem : junkItems.entrySet()) {
                            System.out.printf("%s: %d%n", junkItem.getKey(), junkItem.getValue());
                        }

                        return;
                    }
                } else {

                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, point);
                    } else {
                        int oldPoins = junkItems.get(item);
                        int newPoints = oldPoins + point;
                        junkItems.put(item, newPoints);
                    }
                }
            }
        }
    }
}
