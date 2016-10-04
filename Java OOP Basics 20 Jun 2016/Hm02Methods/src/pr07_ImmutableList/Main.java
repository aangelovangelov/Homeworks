package pr07_ImmutableList;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.IOException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException {
        Class listClass = ImmutableList.class;
        java.lang.reflect.Field[] fields = listClass.getDeclaredFields();
        if (fields.length < 1) {
            throw new ClassFormatException();
        }

        Method method = listClass.getDeclaredMethods()[0];
        System.out.println(method.getReturnType().getSimpleName());
    }
}
