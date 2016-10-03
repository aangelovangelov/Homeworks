import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr05_ExtractEmail {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder line =new StringBuilder(reader.readLine());

        String regex = "(?<mail>(?<user>\\b(?<!\\.|_|-)[a-zA-Z0-9](?:[\\w\\d\\.\\-]*[a-zA-Z0-9])*)@(?<host>[a-zA-Z0-9](?:[\\w\\d\\-]*[a-zA-Z0-9])*\\.[a-zA-Z0-9](?:[\\w\\d\\-]*[a-zA-Z0-9])*(?:\\.[a-zA-Z0-9](?:[\\w\\d\\-]*[a-zA-Z0-9])*)*))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.group("mail"));
        }
    }
}
