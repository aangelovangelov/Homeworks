package pr05_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Society> society = new ArrayList<>();

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("End")) {
                break;
            }

            if (input.length == 3) {

                Society person = new Ctizens(input[0], Integer.parseInt(input[1]), input[2]);
                society.add(person);

            } else {

                Society robot = new Robots(input[0], input[1]);
                society.add(robot);

            }
        }

        String pattern = reader.readLine();

        for (Society person : society) {
            if (person.getId().endsWith(pattern)) {
                System.out.println(person.getId());
            }
        }

    }
}
