package pr01_MethodSaysHello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Field[] fields = Class.forName("Person").getDeclaredFields();
        Method[] methods = Class.forName("Person").getDeclaredMethods();
        if (fields.length != 1 || methods.length != 1) {
            throw new ClassFormatError();
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String name = reader.readLine();
            Person person = new Person(name);
            person.sayHello();
        }
    }
}
