package pr09_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new HashMap<>();

        while (true) {
            String line = reader.readLine();
            if ("End".equals(line)) {
                break;
            }

            String[] input = line.split("\\s+");
            String personName = input[0];

            if (!people.containsKey(personName)) {
                Person person = new Person(personName);
                person.addField(input);
                people.put(personName, person);
            } else {
                people.get(personName).addField(input);
            }
        }

        String personNameForPrint = reader.readLine();

        System.out.println(people.get(personNameForPrint));

    }
}
