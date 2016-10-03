import java.util.Scanner;

public class _12_CalculateFactorialOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        long factorialOfNum = factorial(num);
        System.out.println(factorialOfNum);

        sc.close();
    }

    static long factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
           return number * factorial(number - 1);
        }
    }
}
