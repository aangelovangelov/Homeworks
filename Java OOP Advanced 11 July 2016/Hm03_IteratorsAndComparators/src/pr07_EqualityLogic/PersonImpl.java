package pr07_EqualityLogic;

import _08_iteratorsAndComparators._07_equalityLogic.interfaces.Person;

public class PersonImpl implements Person, Comparable<Person> {

    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof PersonImpl)) {
            return false;
        }

        PersonImpl person = (PersonImpl) other;

        if (this.age != person.age) {
            return false;
        }
        return this.name != null ? this.name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = this.name != null ? this.name.hashCode() : 0;
        result = 31 * result + this.age;
        return result;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.getName().compareTo(o.getName());
        if (result == 0) {
            result = Integer.compare(this.age, o.getAge());
        }
        return result;
    }
}
