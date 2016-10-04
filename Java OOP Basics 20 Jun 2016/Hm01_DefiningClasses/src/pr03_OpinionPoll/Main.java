package pr03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int lineCount = Integer.parseInt(reader.readLine());

            List<Person> people = new ArrayList<>();

            for (int i = 0; i < lineCount; i++) {
                String[] input = reader.readLine().split(" ");
                String name = input[0];
                int age = Integer.parseInt(input[1]);

                Person newOne = new Person(name, age);

                people.add(newOne);
            }

            people.stream()
                    .filter(person -> person.age > 30)
                    .sorted((p1, p2) -> p1.name.compareTo(p2.name))
                    .forEach(person -> System.out.printf("%s - %d%n", person.name, person.age));
        }
    }
}
