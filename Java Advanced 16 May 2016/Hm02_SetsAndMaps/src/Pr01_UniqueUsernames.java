import java.util.LinkedHashSet;
import java.util.Scanner;

public class Pr01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> names = new LinkedHashSet<>();

        int lineCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < lineCount; i++) {
            String name = sc.nextLine();
            //if (!names.contains(name)) {
            names.add(name);
            //}
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
