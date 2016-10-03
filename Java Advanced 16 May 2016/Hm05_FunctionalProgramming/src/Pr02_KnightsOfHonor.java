import java.util.Scanner;
import java.util.function.BiConsumer;

public class Pr02_KnightsOfHonor     {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("\\s+");

        BiConsumer<String, String> printHonor = (honor, name) -> System.out.println(honor + " " + name);

        for (String name : names) {
            printHonor.accept("Sir", name);
        }
    }
}
