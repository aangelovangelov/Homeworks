package pr11_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Threeuple> map = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String[] input = reader.readLine().split("\\s+");
            if (i == 0) {

                Threeuple<String, String, String> entry = new Threeuple<>(input[0] + " " + input[1], input[2], input[3]);
                map.add(entry);

            } else if (i == 1) {

                Threeuple<String, Integer, Boolean> entry = new Threeuple<>(input[0], Integer.parseInt(input[1]), input[2].equals("drunk"));
                map.add(entry);

            } else {

                Threeuple<String, Double, String> entry = new Threeuple<>(input[0], Double.parseDouble(input[1]), input[2]);
                map.add(entry);

            }
        }

        for (Threeuple tuple : map) {
            System.out.printf("%s -> %s -> %s%n", tuple.getKey(), tuple.getValue(), tuple.getElement());
        }
    }


}
