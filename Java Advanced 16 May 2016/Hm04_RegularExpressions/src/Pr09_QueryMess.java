import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr09_QueryMess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "([a-zA-Z0-9]+)\\+*\\s*=\\s*\\+*(?:%20)*([a-zA-Z0-9:\\/.]+)(?:\\+*%20\\+*)*([a-zA-Z0-9:\\/.]+)*";
        Pattern pattern = Pattern.compile(regex);


        while (true) {
            String line = reader.readLine();
            if ("END".equals(line)) {
                break;
            }
            LinkedHashMap<String, ArrayList<String>> output = new LinkedHashMap<>();

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
                if (matcher.group(3) != null) {
                    value += " " + matcher.group(3);
                }

                if (!output.containsKey(key)) {
                    output.put(key, new ArrayList<>());
                    output.get(key).add(value);
                    continue;
                }

                output.get(key).add(value);
            }

            for (Map.Entry<String, ArrayList<String>> entry : output.entrySet()) {
                System.out.print(entry.getKey()+"="+entry.getValue());
            }
            System.out.println();
        }
    }
}
