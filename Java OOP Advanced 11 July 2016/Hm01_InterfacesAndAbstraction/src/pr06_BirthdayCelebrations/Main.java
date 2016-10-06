package pr06_BirthdayCelebrations;


import pr06_BirthdayCelebrations.interfaces.Birthavable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Birthavable> birthable = new ArrayList<>();

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("End")) {
                break;
            } else if (input[0].equals("Citizen")) {

                birthable.add(new Citizen(input[1], Integer.parseInt(input[2]), input[3], input[4]));

            } else if (input[0].equals("Pet")) {

                birthable.add(new Pet(input[1], input[2]));

            }
        }

        String pattern = reader.readLine();

        for (Birthavable item : birthable) {

            if (item.getBirthDate() != null && item.getBirthDate().endsWith(pattern)) {
                System.out.println(item.getBirthDate());
            }
        }
    }
}
