import java.util.Scanner;

public class _06Base7ToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strNumber = scanner.next();

        int base7ToDecimalObject = Integer.valueOf(strNumber, 7);
        int base7ToDecimalPrimitive = Integer.parseInt(strNumber, 7);

        System.out.println(base7ToDecimalObject);

        scanner.close();
    }
}
