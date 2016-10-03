import java.util.Scanner;

public class _09HitTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target){
                    System.out.println(i + " + " + j + " = " + target);
                }

                if (i - j == target){
                    System.out.println(i + " - " + j + " = " + target);
                }
            }
        }

        sc.close();
    }
}
