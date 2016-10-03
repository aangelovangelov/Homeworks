import java.util.Scanner;

public class _08OddEvenPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (numbers.length % 2 != 0){
            System.out.println("Invalid length");
        } else{
            for (int i = 0; i < numbers.length; i += 2) {
                if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0){
                    System.out.printf("%d, %d -> both are even%n", numbers[i], numbers[i + 1]);
                } else if (numbers[i] % 2 != 0 && numbers[i + 1] % 2 != 0){
                    System.out.printf("%d, %d -> both are odd%n", numbers[i], numbers[i + 1]);
                } else {
                    System.out.printf("%d, %d -> different%n", numbers[i], numbers[i + 1]);
                }
            }
        }
        sc.close();
    }
}
