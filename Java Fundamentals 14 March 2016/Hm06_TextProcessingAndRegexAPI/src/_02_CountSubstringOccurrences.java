import java.util.Scanner;

public class _02_CountSubstringOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        String word = sc.nextLine();

        int count = 0;
        int index = line.indexOf(word);
        while (index != -1) {
            count++;
            index = line.indexOf(word, index + 1);
        }

        System.out.println(count);
    }
}
