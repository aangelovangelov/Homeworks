package pr03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CostemStack stack = new CostemStack();

        while (true) {
            String[] input = reader.readLine().split("[,\\s]+");
            String command = input[0].toLowerCase();
            if ("end".equals(command)) {
                break;
            }

            switch (command) {
                case "pop":
                    try {
                        stack.pop();
                    } catch (UnsupportedOperationException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case "push":
                    for (int i = 1; i < input.length; i++) {
                        stack.push(Integer.parseInt(input[i]));
                    }
                    break;

                default:
                    break;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (Integer integer : stack) {
                System.out.println(integer);
            }
        }

    }

}
