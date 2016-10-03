import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr16_ExtractHyperlinks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder line = new StringBuilder();

        while (true) {
            String input = reader.readLine();
            if ("END".equals(input)) {
                break;
            }

            line.append(input);
        }

        int openIndex = line.indexOf("<a");
        while (openIndex != -1) {
            int closeIndex = line.indexOf(">", openIndex);
            String openClose = " " + line.substring(openIndex + "<a".length(), closeIndex).trim();
            if (!openClose.contains(" href")) {
                openIndex = line.indexOf("<a", openIndex + 1);
                continue;
            }
            String startsWith = openClose.substring(openClose.indexOf(" href") + 5).trim();

            startsWith = startsWith.substring(1).trim();


            if (startsWith.charAt(0) == '"') {
                startsWith = startsWith.substring(1, startsWith.indexOf("\"", 1));
            } else if (startsWith.charAt(0) == '\'') {
                startsWith = startsWith.substring(1, startsWith.indexOf("'", 1));
            } else if (startsWith.contains(" ")) {
                startsWith = startsWith.substring(0, startsWith.indexOf(" "));
            }

            System.out.println(startsWith);
            openIndex = line.indexOf("<a", openIndex + 1);
        }
    }
}
