package pr05_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();

        while (true) {
            String[] personInput = reader.readLine().split("\\s+");
            if (personInput[0].equalsIgnoreCase("end")) {
                break;
            }
            Person person = new Person(personInput[0], Integer.parseInt(personInput[1]), personInput[2]);
            people.add(person);
        }

        Person person = people.get(Integer.parseInt(reader.readLine()) - 1);

        int equalPersonCount = 0;
        for (Person person1 : people) {
            if (person.compareTo(person1) == 0) {
                equalPersonCount++;
            }
        }

        if (equalPersonCount <= 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equalPersonCount, people.size() - equalPersonCount, people.size());
        }

    }

}
