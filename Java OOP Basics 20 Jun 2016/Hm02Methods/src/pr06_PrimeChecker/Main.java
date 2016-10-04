package pr06_PrimeChecker;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(reader.readLine());

            Boolean bool = false;
            Number number = new Number(num, bool);

            System.out.printf("%d, %s", number.getNumber(), number.isPrime());

            java.lang.reflect.Field[] fields = Number.class.getDeclaredFields();

            List<java.lang.reflect.Field> filedsDeclared = Arrays.stream(fields)
                    .filter(f -> f.getName().contains("Prime") || f.getName().contains("number"))
                    .collect(Collectors.toList());

            List<Constructor<?>> constructors = Arrays.stream(Number.class.getDeclaredConstructors())
                    .filter(c -> c.getParameterCount() > 1)
                    .collect(Collectors.toList());

            if (filedsDeclared.size() <= 1 || constructors.size() < 1) {
                throw new ClassFormatException();
            }
        }
    }
}
