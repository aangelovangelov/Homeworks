package pr01_MethodSaysHello;

public class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.printf("%s says \"Hello\"!", this.name);
    }
}
