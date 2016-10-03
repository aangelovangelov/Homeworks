import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr10_PopulationCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //          country    totalPopulation
        LinkedHashMap<String, Long> countriesPopulation = new LinkedHashMap<>();

        //  country               city    population
        Map<String, LinkedHashMap<String, Long>> citiesPopulation = new LinkedHashMap<>();


        while (true) {
            String line = sc.nextLine();
            if ("report".equals(line)) {
                break;
            }

            String[] input = line.split("\\|");
            String country = input[1];
            String city = input[0];
            Long population = Long.parseLong(input[2]);

            // Filling countriesPopulation
            if (!countriesPopulation.containsKey(country)) {
                countriesPopulation.put(country, population);
            } else {
                Long oldValue = countriesPopulation.get(country);
                countriesPopulation.put(country, oldValue + population);
            }

            // Filling citiesPopulation
            if (!citiesPopulation.containsKey(country)) {
                citiesPopulation.put(country, new LinkedHashMap<>());
                citiesPopulation.get(country).put(city, population);
            } else {
                citiesPopulation.get(country).put(city, population);
            }
        }

        countriesPopulation.entrySet().stream().sorted((entry1, entry2) -> {
            return entry2.getValue().compareTo(entry1.getValue());
        }).forEach(countryPopulationEntry -> {

            System.out.printf("%s (total population: %d)%n",
                    countryPopulationEntry.getKey(), countryPopulationEntry.getValue());

            LinkedHashMap<String, Long> insideMap = citiesPopulation.get(countryPopulationEntry.getKey());

            insideMap.entrySet().stream().sorted((e1, e2) -> {
                return e2.getValue().compareTo(e1.getValue());
            }).forEach(entry -> {
                System.out.printf("=>%s: %d%n", entry.getKey(), entry.getValue());
            });
        });
    }
}
