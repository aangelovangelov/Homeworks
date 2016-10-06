package pr07_EqualityLogic.interfaces;

public interface Person extends Comparable<Person> {
    String getName();
    int getAge();
}
