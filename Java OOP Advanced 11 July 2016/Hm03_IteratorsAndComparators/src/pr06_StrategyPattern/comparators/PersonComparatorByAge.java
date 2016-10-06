package pr06_StrategyPattern.comparators;

import _08_iteratorsAndComparators._06_strategyPattern.Person;

import java.util.Comparator;

public class PersonComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }

}
