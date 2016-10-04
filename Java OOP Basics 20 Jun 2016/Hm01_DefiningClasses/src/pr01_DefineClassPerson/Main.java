package pr01_DefineClassPerson;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();

        System.out.println(fields.length);
    }
}
