import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_FilterArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");

        Arrays.stream(strings)
                .filter(str -> str.length() > 3)
                .forEach(str -> System.out.print(str + " "));


        sc.close();
    }
}
