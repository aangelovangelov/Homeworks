import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr08_ExtractHyperlinks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text = new StringBuilder();
        while (true) {
            String line = reader.readLine();
            if ("END".equals(line)) {
                break;
            }

            text.append(line);
        }

        String regex = "<a[^>]+href\\s*=\\s*(?:(?:\"([^\"]+)\")|(?:'([^']+)')|(?:\\s*([^\\s>]+)))[^>]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text.toString());

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                System.out.println(matcher.group(1));
            } else if (matcher.group(2) != null) {
                System.out.println(matcher.group(2));
            } else {
                System.out.println(matcher.group(3));
            }
        }
    }
}
