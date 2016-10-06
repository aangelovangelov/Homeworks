package pr04_Тelephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Phone phone = new Phone();

        String[] phones = reader.readLine().split("\\s+");
        String[] sites = reader.readLine().split("\\s+");

        for (String phonee : phones) {
            phone.call(phonee);
        }

        for (String site : sites) {
            phone.brows(site);
        }
    }
}
