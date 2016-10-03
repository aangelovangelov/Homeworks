import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr03_SeriesOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String regex = "(?<char>.)\\k<char>*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.print(matcher.group("char"));
        }
    }
}
