import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr04_ReplaceTag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer text = new StringBuffer();

        while (true) {
            String line = reader.readLine();
            if ("end".equals(line)) {
                break;
            }
            text.append(line);
        }

        String result = text.toString();
        result = result.replace("<a", "[URL");
        result = result.replace("</a>", "[/URL]");

        System.out.println(result);
    }
}
