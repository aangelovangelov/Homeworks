import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pr05_SequenceWithQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        Deque<Long> queue = new ArrayDeque<>();
        queue.add(number);

        for (int i = 0; i < 50; i++) {
            queue.add(queue.peek() + 1);
            queue.add(2 * number + 1);
            queue.add(number + 2);
            System.out.print(queue.remove() + " ");
        }
    }
}
