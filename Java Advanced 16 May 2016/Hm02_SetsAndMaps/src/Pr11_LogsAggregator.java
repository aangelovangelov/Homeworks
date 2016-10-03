import java.util.*;

public class Pr11_LogsAggregator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //      user    duration
        TreeMap<String, Integer> userDurations = new TreeMap<>();

        //  user            ips
        Map<String, TreeSet<String>> userIps = new HashMap<>();

        int lineCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lineCount; i++) {
            String[] input = sc.nextLine().split("\\s+");

            String ip = input[0];
            String user = input[1];
            int duration = Integer.parseInt(input[2]);

            if (!userDurations.containsKey(user)) {
                userDurations.put(user, duration);
            } else {
                int oldValue = userDurations.get(user);
                userDurations.put(user, oldValue + duration);
            }

            if (!userIps.containsKey(user)) {
                userIps.put(user, new TreeSet<>());
                userIps.get(user).add(ip);
            } else {
                userIps.get(user).add(ip);
            }
        }

        for (String user : userDurations.keySet()) {

            System.out.print(user + ": " + userDurations.get(user) + " ");

            TreeSet<String> ipsOfThisUser = userIps.get(user);

            System.out.println(ipsOfThisUser);
        }
    }
}
