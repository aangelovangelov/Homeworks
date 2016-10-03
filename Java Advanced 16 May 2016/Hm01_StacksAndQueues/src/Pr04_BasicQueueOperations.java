import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Pr04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the input
        int[] firstNums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int countToAdd = firstNums[0];
        int countToRemove = firstNums[1];
        int existingNum = firstNums[2];

        String[] numbers = sc.nextLine().split(" ");
        Queue<Integer> queue = new ArrayDeque<>();

        // Adding elements to queue
        for (int i = 0; i < countToAdd; i++) {
            queue.add(Integer.parseInt(numbers[i]));
        }

        // Remove elements from queue
        for (int i = 0; i < countToRemove; i++) {
            queue.remove();
        }

        // Finding is it exist
        // Finding the min number
        boolean isExist = false;
        int minNum = Integer.MAX_VALUE;
        if (queue.size() == 0) {
            minNum = 0;
        }
        while (queue.size() > 0) {
            if (queue.peek() == existingNum) {
                isExist = true;
            }
            if (queue.peek() < minNum) {
                minNum = queue.peek();
            }
            queue.remove();
        }

        // Printing
        if (isExist) {
            System.out.println(isExist);
        } else {
            System.out.println(minNum);
        }
    }
}
