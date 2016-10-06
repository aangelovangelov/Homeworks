package pr10_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Tuple> map = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String[] input = reader.readLine().split("\\s+");
            if (i == 0) {

                Tuple<String, String> entry = new Tuple<>(input[0] + " " + input[1], input[2]);
                map.add(entry);

            } else if (i == 1) {

                Tuple<String, Integer> entry = new Tuple<>(input[0], Integer.parseInt(input[1]));
                map.add(entry);

            } else {

                Tuple<String, Double> entry = new Tuple<>(input[0], Double.parseDouble(input[1]));
                map.add(entry);

            }
        }

        for (Tuple tuple : map) {
            System.out.printf("%s -> %s%n", tuple.getKey(), tuple.getValue());
        }
    }


}
