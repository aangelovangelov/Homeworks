import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_ExtractEmails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(([a-z\\.]+)@([a-z\\.]+\\b))");

        while (true) {
            String line = sc.nextLine();
            if (line.equals("")) {
                break;
            }

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }
    }
}
