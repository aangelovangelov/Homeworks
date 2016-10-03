import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pr06_TruckTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOilStations = sc.nextInt();
        sc.nextLine();

        Deque<String> oilStations = new ArrayDeque<>();
        Deque<Integer> indexis = new ArrayDeque<>();

        for (int i = 0; i < countOilStations; i++) {
            oilStations.add(sc.nextLine());
            indexis.add(i);
        }

        long totalOil = 0;
        int iterationCounter = 0;
        for (int i = 0; i <= countOilStations; i++) {
            iterationCounter++;
            if (iterationCounter > countOilStations * 2) {
                break;
            }

            String[] input = oilStations.peek().split(" ");
            int oil = Integer.parseInt(input[0]);
            int distance = Integer.parseInt(input[1]);
            totalOil += oil;
            if (totalOil < distance) {
                i = -1;
                totalOil = 0;
            } else {
                totalOil -= distance;
            }


            if (i == countOilStations) {
                System.out.println(indexis.peek());
                break;
            }

            oilStations.addLast(oilStations.removeFirst());
            indexis.addLast(indexis.removeFirst());
        }
    }
}
