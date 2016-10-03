import java.util.Scanner;

public class Pr03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//will be valid for parsing the binary string
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        String binary = Integer.toBinaryString(a);
        if (binary.length() > 10) {
            binary = binary.substring(0, 10);
        }

        int intBynary = Integer.parseInt(binary);

        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, intBynary, b, c);
    }
}
