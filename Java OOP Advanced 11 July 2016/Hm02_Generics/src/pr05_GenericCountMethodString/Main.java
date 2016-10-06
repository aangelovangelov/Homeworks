package pr05_GenericCountMethodString;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Box<String>> data = new ArrayList<>();

        int lineCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lineCount; i++) {
            data.add(new Box(reader.readLine()));
        }

        String element = reader.readLine();

        System.out.println(countGreater(data, new Box<>(element)));

    }

    private static <T extends Comparable<T>> int countGreater(List<T> elements, T element) {
        int count = 0;
        for (T listElement : elements) {
            if (listElement.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }
}
