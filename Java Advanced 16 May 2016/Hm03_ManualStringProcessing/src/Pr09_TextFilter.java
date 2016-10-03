import java.util.Scanner;

public class Pr09_TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] banWords = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (int i = 0; i < banWords.length; i++) {
            String wordForBan = banWords[i];

            String removed = new String(new char[wordForBan.length()]).replace('\0', '*');

            text = text.replace(wordForBan, removed);
        }

        System.out.println(text);
    }
}
