package pr06_StrategyPattern.comparators;

import _08_iteratorsAndComparators._06_strategyPattern.Person;

import java.util.Comparator;

public class PersonComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        int compareByLength = person1.getName().length() - person2.getName().length();
        int compareByFirstChar = Character.compare(
                person1.getName().toLowerCase().charAt(0),
                person2.getName().toLowerCase().charAt(0));

        if (compareByLength != 0) {
            return compareByLength;
        }

        return compareByFirstChar;
    }

}
