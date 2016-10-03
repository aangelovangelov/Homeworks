import java.util.Scanner;
import java.util.TreeMap;

public class Pr05_Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //      person  phone
        TreeMap<String, String> phonebook = new TreeMap<>();

        String line = sc.nextLine();
        while (!"search".equals(line.toLowerCase())) {
            String[] input = line.split("-");
            phonebook.put(input[0], input[1]);

            line = sc.nextLine();
        }

        String person = sc.nextLine();
        while (!"stop".equals(person)) {
            if (phonebook.containsKey(person)) {
                System.out.printf("%s -> %s%n", person, phonebook.get(person));
            } else {
                System.out.printf("Contact %s does not exist.%n", person);
            }

            person = sc.nextLine();
        }
    }
}
