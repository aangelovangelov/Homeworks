import java.util.Scanner;

public class Pr02_StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.length() < 20) {
            int iterations = 20 - line.length();
            for (int i = 0; i < iterations; i++) {
                line = line + "*";
            }
        }
        System.out.println(line);
    }
}
