import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Pr02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstNums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count = firstNums[0];
        int countForPoping = firstNums[1];
        int existingNum = firstNums[2];

        String[] numbers = sc.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            stack.add(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < countForPoping; i++) {
            stack.pop();
        }

        boolean isExist = false;
        int minInt = Integer.MAX_VALUE;
        if (stack.size() == 0) {
            minInt = 0;
        }
        while (stack.size() > 0) {
            if (stack.peek() == existingNum) {
                isExist = true;
            }
            if (stack.peek() < minInt) {
                minInt = stack.pop();
            } else {
                stack.pop();
            }
        }

        if (isExist) {
            System.out.println(isExist);
        } else {
            System.out.println(minInt);
        }
    }
}
