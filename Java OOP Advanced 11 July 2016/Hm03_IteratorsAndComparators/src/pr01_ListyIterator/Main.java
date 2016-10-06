package pr01_ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] createCommand = reader.readLine().split("\\s+");
        ListyIterator listyIterator = new ListyIterator(Arrays.asList(createCommand));
        if (createCommand.length >= 1) {
            listyIterator = new ListyIterator(Arrays.asList(createCommand).subList(1, createCommand.length));
        }

        while (true) {
            String command = reader.readLine();
            if ("end".equalsIgnoreCase(command)) {
                break;
            }

            Command.execute(listyIterator, command);
        }
    }
}


