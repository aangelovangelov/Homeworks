package pr02_OldestFamilyMember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException {

        Family family = new Family();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int lineCount = Integer.parseInt(reader.readLine());

            for (int i = 0; i < lineCount; i++) {
                String[] input = reader.readLine().split("\\s+");
                String name = input[0];
                int age = Integer.parseInt(input[1]);

                Person person = new Person(name, age);

                family.addFamilyMember(person);
            }

            System.out.println(family.getOldestMember());
            Method getOldestMethod = Family.class.getMethod("getOldestMember");
            Method addMemberMethod = Family.class.getMethod("addFamilyMember", Person.class);
        }
    }
}
