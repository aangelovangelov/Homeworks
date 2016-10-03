import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr09_UserLogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //       user                  ips   messageCount
        TreeMap<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();

        while (true) {
            String line = sc.nextLine();
            if ("end".equals(line)) {
                break;
            }

            String[] input = line.split(" ");
            String ip = input[0].substring(3);
            String user = input[2].substring(5);

            if (!userLogs.containsKey(user)) {
                userLogs.put(user, new LinkedHashMap<>());
            }

            if (!userLogs.get(user).containsKey(ip)) {
                userLogs.get(user).put(ip, 1);
                continue;
            }

            int oldValue = userLogs.get(user).get(ip);
            userLogs.get(user).put(ip, oldValue + 1);
        }


        for (String user : userLogs.keySet()) {
            System.out.println(user + ":");

            LinkedHashMap<String, Integer> ips = userLogs.get(user);

            int counter = 0;
            for (String ip : ips.keySet()) {
                counter++;
                System.out.printf("%s => %d", ip, ips.get(ip));
                if (counter < ips.size()) {
                    System.out.print(", ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
