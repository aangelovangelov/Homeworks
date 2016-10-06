package pr05_ComparingObjects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    private void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        int firstCompare = this.name.compareTo(anotherPerson.getName());
        int secondCompare = this.age - anotherPerson.getAge();
        int thirdCompare = this.town.compareTo(anotherPerson.getTown());

        if (firstCompare != 0) {
            return firstCompare;
        } else if (secondCompare != 0) {
            return secondCompare;
        }

        return thirdCompare;
    }
}
