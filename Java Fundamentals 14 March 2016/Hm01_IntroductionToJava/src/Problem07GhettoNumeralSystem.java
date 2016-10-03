import java.util.Scanner;

public class Problem07GhettoNumeralSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNumber = scanner.next();

        for (int i = 0; i < strNumber.length(); i++) {

            char characterDigit = strNumber.charAt(i);

            switch (characterDigit){
                case '0':
                    System.out.print("Gee");
                    break;
                case '1':
                    System.out.print("Bro");
                    break;
                case '2':
                    System.out.print("Zuz");
                    break;
                case '3':
                    System.out.print("Ma");
                    break;
                case '4':
                    System.out.print("Duh");
                    break;
                case '5':
                    System.out.print("Yo");
                    break;
                case '6':
                    System.out.print("Dis");
                    break;
                case '7':
                    System.out.print("Hood");
                    break;
                case '8':
                    System.out.print("jam");
                    break;
                case '9':
                    System.out.print("Mack");
                    break;
            }
        }
        scanner.close();
    }
}
