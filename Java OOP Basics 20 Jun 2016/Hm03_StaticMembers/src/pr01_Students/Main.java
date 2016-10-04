package pr01_Students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if ("End".equals(name)) {
                break;
            }
            Students student = new Students(name);
        }

        System.out.println(Students.getStudentsCount());
    }
}
