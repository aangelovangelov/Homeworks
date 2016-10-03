import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_CountAllWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        int counter = 0;
        while (true) {
            String line = sc.nextLine();
            if (line.equals("")) {
                break;
            }

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
