import java.util.Scanner;

public class _01RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // First way
//        String[] strArr = scanner.nextLine().split(" ");
//        int[] intArr = new int[strArr.length];
//        for (int i = 0; i < strArr.length; i++) {
//            intArr[i] = Integer.parseInt(strArr[i]);
//        }
//
//        int a = intArr[0];
//        int b = intArr[1];

        // Second way
//        int a = Integer.parseInt(scanner.next());
//        int b = Integer.parseInt(scanner.next());

        // Third way
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long recArea = a * b;
        System.out.println(recArea);

        scanner.close();
    }
}