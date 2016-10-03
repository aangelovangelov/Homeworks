import java.util.Scanner;

public class _02TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pointAX = scanner.nextInt();
        int pointAY = scanner.nextInt();
        int pointBX = scanner.nextInt();
        int pointBY = scanner.nextInt();
        int pointCX = scanner.nextInt();
        int pointCY = scanner.nextInt();

        long firstAddend = pointAX * (pointBY - pointCY);
        long secondAddend = pointBX * (pointCY - pointAY);
        long thirdAddend = pointCX * (pointAY - pointBY);

        double area = Math.abs((firstAddend + secondAddend + thirdAddend) / 2);

        System.out.println(Math.round(area));

        scanner.close();
    }
}
