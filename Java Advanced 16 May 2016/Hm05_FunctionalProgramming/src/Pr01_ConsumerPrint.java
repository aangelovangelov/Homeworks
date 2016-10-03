import java.util.Scanner;
import java.util.function.Consumer;

public class Pr01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("\\s+");
        Consumer<String> print = string -> System.out.println(string);

        for (String name : names) {
            print.accept(name);
        }
    }
}
