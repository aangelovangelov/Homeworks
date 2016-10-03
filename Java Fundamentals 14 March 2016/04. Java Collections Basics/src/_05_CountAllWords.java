import java.util.Scanner;

public class _05_CountAllWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] words = line.split("\\W+");
        System.out.println(words.length);

        sc.close();
    }
}
