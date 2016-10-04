package pr02_UniqueStudentNames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StudentGroup students = new StudentGroup();

        while (true) {
            String name = reader.readLine();
            if ("End".equals(name)) {
                break;
            }

            students.addStudent(new Student(name));
        }

        System.out.println(StudentGroup.getCount());
    }
}
