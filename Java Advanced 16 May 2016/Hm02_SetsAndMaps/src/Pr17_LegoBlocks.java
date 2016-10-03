import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Pr17_LegoBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String>[] firstMatrix = new LinkedList[n];
        Deque<String>[] secondMatrix = new ArrayDeque[n];

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                for (int line = 0; line < n; line++) {
                    String[] input = sc.nextLine().split("\\s+");

                    for (int k = 0; k < input.length; k++) {
                        if (!"".equals(input[k])) {
                            if (firstMatrix[line] == null) {
                                firstMatrix[line] = new LinkedList<>();
                            }
                            firstMatrix[line].add(input[k]);
                        }
                    }
                }
            } else {
                for (int line = 0; line < n; line++) {
                    String[] input = sc.nextLine().split("\\s+");

                    for (int k = 0; k < input.length; k++) {
                        if (!"".equals(input[k])) {
                            if (secondMatrix[line] == null) {
                                secondMatrix[line] = new ArrayDeque<>();
                            }
                            secondMatrix[line].push(input[k]);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int stackSize = secondMatrix[i].size();
            for (int j = 0; j < stackSize; j++) {
                firstMatrix[i].add(secondMatrix[i].pop());
            }
        }

        boolean areFiting = true;
        int counter = firstMatrix[0].size();
        for (int i = 0; i < firstMatrix.length - 1; i++) {
            if (firstMatrix[i].size() != firstMatrix[i + 1].size()) {
                areFiting = false;
            }

            counter += firstMatrix[i + 1].size();
        }

        if (areFiting) {
            for (int i = 0; i < firstMatrix.length; i++) {
                System.out.println(firstMatrix[i]);
            }
        } else {
            System.out.printf("The total number of cells is: %d", counter);
        }
    }
}
