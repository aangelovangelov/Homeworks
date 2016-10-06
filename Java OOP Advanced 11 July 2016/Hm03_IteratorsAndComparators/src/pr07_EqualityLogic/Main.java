package pr07_EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(reader.readLine());
        TreeSet<PersonImpl> treeSet = new TreeSet<>();
        HashSet<PersonImpl> hashSet = new HashSet<>();

        for (int i = 0; i < lineCount; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            PersonImpl person = new PersonImpl(name, age);
            treeSet.add(person);
            hashSet.add(person);
        }

        System.out.println(treeSet.size());
        System.out.println(hashSet.size());
    }
}
