import java.util.Arrays;
import java.util.Scanner;

public class _02_SortArrayWithStreamAPI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        String sortingOrder = sc.nextLine();

        Arrays.stream(numbers)
                .map(num -> Integer.parseInt(num))
                .sorted((num1, num2) -> {
                    if (sortingOrder.equals("Ascending")) {
                        return num1.compareTo(num2);
                    }
                    return num2.compareTo(num1);

                }).forEach(num -> System.out.print(num + " "));


        sc.close();
    }
}
