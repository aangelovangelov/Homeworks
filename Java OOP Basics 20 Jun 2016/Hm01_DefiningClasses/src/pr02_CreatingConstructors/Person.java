package pr02_CreatingConstructors;

public class Person {

    String name;
    int age;

    Person() {
        this.name = "No name";
        this.age = 1;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this(name, 1);
    }

    Person(int age) {
        this("No name", age);
    }
}
