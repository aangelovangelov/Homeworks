import java.util.Scanner;

public class Pr10_UnicodeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            int character = line.charAt(i);
            System.out.printf("\\u%04x", character);
        }
    }
}
