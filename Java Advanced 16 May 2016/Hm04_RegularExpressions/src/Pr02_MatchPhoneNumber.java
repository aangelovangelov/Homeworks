import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr02_MatchPhoneNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "\\+359(?<delimiter> |-)2\\k<delimiter>\\d{3}\\k<delimiter>\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);

        while (true) {
            String line = reader.readLine();
            if ("end".equals(line)) {
                break;
            }

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
