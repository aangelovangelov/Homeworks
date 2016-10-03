import java.util.Scanner;
import java.util.Stack;

public class Pr01_ReverseNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> reversed = new Stack<>();

        for (int i = 0; i < line.length; i++) {
            stack.add(Integer.parseInt(line[i]));
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }
}
