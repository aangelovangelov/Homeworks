package pr08_CustomListSorter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomList<String> strings = new CustomListImpl<>();


        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if ("END".equals(input[0])) {
                break;
            }

            commandExecutor(strings, input);
        }
    }

    private static void commandExecutor(CustomList<String> strings, String[] input) {

        switch (input[0]) {
            case "Add":
                strings.add(input[1]);
                break;

            case "Max":
                System.out.println(strings.getMax());
                break;

            case "Min":
                System.out.println(strings.getMin());
                break;

            case "Greater":
                System.out.println(strings.countGreaterThat(input[1]));
                break;

            case "Swap":
                strings.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                break;

            case "Contains":
                System.out.println(strings.contains(input[1]));
                break;

            case "Print":
                System.out.println(strings);
                break;

            case "Remove":
                strings.remove(Integer.parseInt(input[1]));
                break;

            case "Sort":
                Sorter.sort(strings);
                break;

            default:
                break;
        }
    }
}
