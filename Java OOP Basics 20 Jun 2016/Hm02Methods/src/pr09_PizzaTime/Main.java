package pr09_PizzaTime;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, List<Pizza>> pizzas = Pizza.createCollection(reader.readLine().split("\\s+"));

        for (Integer group : pizzas.keySet()) {
            System.out.print(group + " - ");
            String output = "";
            for (Pizza pizza : pizzas.get(group)) {
                output += pizza.getName() + ", ";
            }
            output = output.substring(0, output.length() - 2);
            System.out.println(output);
        }

        Class<?> pizzaClass = Pizza.class;
        java.lang.reflect.Method[] methods = pizzaClass.getDeclaredMethods();
        List<Method> checkedMethods = Arrays.stream(methods)
                .filter(m -> m.getReturnType().getName().contains("Map"))
                .collect(Collectors.toList());

        if (checkedMethods.size() < 1) {
            throw new ClassFormatException();
        }
    }
}
