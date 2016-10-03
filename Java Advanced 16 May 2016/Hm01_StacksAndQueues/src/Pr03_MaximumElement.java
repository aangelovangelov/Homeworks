import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Scanner;

public class Pr03_MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();
        maxStack.push(Integer.MIN_VALUE);

        for (int i = 0; i < lines; i++) {
            String[] input = sc.nextLine().split(" ");
            String comand = input[0];
            if ("1".equals(comand)) {
                stack.push(Integer.parseInt(input[1]));
                if (stack.peek() > maxStack.peek()) {
                    maxStack.push(stack.peek());
                }
            } else if ("2".equals(comand)) {
                if (stack.size() > 0) {
                    if (Objects.equals(stack.pop(), maxStack.peek())) {
                        maxStack.pop();
                    }
                }
            } else {
                if (stack.size() == 0) {
                    System.out.println(0);
                } else if (stack.size() == 1) {
                    System.out.println(stack.peek());
                } else {
                    System.out.println(maxStack.peek());
                }
            }
        }
    }
}
