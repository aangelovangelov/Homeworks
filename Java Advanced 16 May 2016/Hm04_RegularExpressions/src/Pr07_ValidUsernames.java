import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr07_ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String regex = "\\b(?<=^| |\\\\|\\/|\\(|\\))[a-zA-z]\\w{2,24}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        ArrayList<String> users = new ArrayList<>();

        while (matcher.find()) {
            users.add(matcher.group());
        }

        long biggestSum = Long.MIN_VALUE;
        String firtsUser = "";
        String seconUser = "";
        for (int i = 0; i < users.size() - 1; i++) {
            String currUser = users.get(i);
            String nextUser = users.get(i + 1);

            long currSum = currUser.length() + nextUser.length();

            if (currSum > biggestSum) {
                biggestSum = currSum;
                firtsUser = currUser;
                seconUser = nextUser;
            }
        }

        System.out.println(firtsUser +"\n"+ seconUser);
    }
}
