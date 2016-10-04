package pr04_BeerCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if ("End".equals(input[0])) {
                break;
            }

            int boughtBeers = Integer.parseInt(input[0]);
            int drankBeers = Integer.parseInt(input[1]);

            BeerCounter.buyBeer(boughtBeers);
            BeerCounter.drinkBeer(drankBeers);
        }

        System.out.printf("%d %d", BeerCounter.getBeerInStock(), BeerCounter.getBeersDrankCount());
    }
}
