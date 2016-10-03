import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_ExtractWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([a-zA-Z]+)");

        while (true) {
            String line = sc.nextLine();
            if (line.equals("")) {
                break;
            }

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.print(matcher.group() + " ");
            }
            System.out.println();
        }
    }
}
