package pr04_GenericSwapMethodInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> data = new ArrayList<>();

        int lineCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lineCount; i++) {
            data.add(Integer.parseInt(reader.readLine()));
        }

        Integer[] indexes = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Swapper<Integer> swapper = new Swapper<>(data);
        swapper.swap(indexes[0], indexes[1]);

        System.out.println(swapper);
    }
}