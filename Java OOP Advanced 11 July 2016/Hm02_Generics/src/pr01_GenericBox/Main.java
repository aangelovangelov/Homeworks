package pr01_GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lineCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lineCount; i++) {
            String line = reader.readLine();

            Box<String> box = new Box<>(line);

            System.out.println(box);
        }
    }
}
