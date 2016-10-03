import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pr06_MinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Long> resources = new LinkedHashMap<>();

        String resource = sc.nextLine();
        while (!"stop".equals(resource)) {
            long quantity = sc.nextLong();
            sc.nextLine();

            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else {
                resources.put(resource, resources.get(resource) + quantity);
            }

            resource = sc.nextLine();
        }

        for (String metal : resources.keySet()) {
            System.out.printf("%s -> %d%n", metal, resources.get(metal));
        }
    }
}
