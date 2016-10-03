import java.util.Scanner;

public class Pr15_MelrahShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String pattern = sc.nextLine();

        boolean haveBorder = line.indexOf(pattern) != line.lastIndexOf(pattern);

        while (haveBorder && pattern.length() > 0) {

            line = line.substring(0, line.indexOf(pattern)) +
                    line.substring(line.indexOf(pattern) + pattern.length(), line.lastIndexOf(pattern)) +
                    line.substring(line.lastIndexOf(pattern) + pattern.length());


            pattern = pattern.substring(0, pattern.length() / 2) +
                    pattern.substring(pattern.length() / 2 + 1);

            System.out.println("Shaked it.");

            haveBorder = line.indexOf(pattern) != line.lastIndexOf(pattern);
        }

        System.out.println("No shake.");
        System.out.println(line);
    }
}
