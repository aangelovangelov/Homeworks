package pr06_StrategyPattern;

import _08_iteratorsAndComparators._06_strategyPattern.comparators.PersonComparatorByAge;
import _08_iteratorsAndComparators._06_strategyPattern.comparators.PersonComparatorByName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person> firstCollection = new TreeSet<>(new PersonComparatorByName());
        TreeSet<Person> secondCollection = new TreeSet<>(new PersonComparatorByAge());
        int lineCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lineCount; i++) {
            String[] input = reader.readLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            firstCollection.add(person);
            secondCollection.add(person);
        }

        firstCollection.stream()
                .forEach(person -> System.out.printf("%s %d%n", person.getName(), person.getAge()));

        secondCollection.stream()
                .forEach(person -> System.out.printf("%s %d%n", person.getName(), person.getAge()));
    }

}
