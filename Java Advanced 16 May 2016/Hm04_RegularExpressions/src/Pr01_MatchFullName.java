import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr01_MatchFullName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "\\b(?<name>[A-Z][a-z]+ [A-Z][a-z]+)\\b";
        Pattern pattern = Pattern.compile(regex);


        while (true) {
            String inputLine = reader.readLine();
            if ("end".equals(inputLine)) {
                break;
            }

            Matcher matcher = pattern.matcher(inputLine);

            while (matcher.find()) {
                System.out.println(matcher.group("name"));
            }
        }
    }
}
