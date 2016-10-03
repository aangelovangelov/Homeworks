import java.util.LinkedHashMap;
import java.util.Scanner;

public class Pr07_FixEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //            person   email
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        String person = sc.nextLine();
        while (!"stop".equals(person)) {
            String email = sc.nextLine();
            int indexLastPoint = email.lastIndexOf('.');
            String emailEnd = email.toLowerCase().substring(indexLastPoint);
            boolean isUnvalidEmail = ".us".equals(emailEnd) || ".uk".equals(emailEnd);

            if (!isUnvalidEmail) {
                emails.put(person, email);
            }

            person = sc.nextLine();
        }

        for (String name : emails.keySet()) {
            System.out.printf("%s -> %s%n", name, emails.get(name));
        }
    }
}
