import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_CountSpecifiedWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        String word = sc.next();
        int count = 0;
        Pattern pattern = Pattern.compile("\\W+(" + word + ")\\W+");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
