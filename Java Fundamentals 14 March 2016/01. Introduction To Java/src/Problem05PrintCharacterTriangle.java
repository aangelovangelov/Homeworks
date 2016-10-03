import java.util.Scanner;

public class Problem05PrintCharacterTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());//scanner.nextInt();

        for (int row = 0; row < number; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char)('a' + col) + " ");
            }
            System.out.println();
        }

        for (int row = number - 1; row > 0 ; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print((char)('a' + col) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
