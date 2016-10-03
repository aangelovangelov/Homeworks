import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = scanner.nextInt();

//        scanner.nextLine();
//        String[] strArrOfNums = scanner.nextLine().split(" ");
//        int[] numbersArr = new int[strArrOfNums.length];
//        for (int i = 0; i < countNumbers; i++) {
//            numbersArr[i] = Integer.parseInt(strArrOfNums[i]);
//        }
        int[] numbersArr = new int[countNumbers];
        for (int i = 0; i < countNumbers; i++) {
            numbersArr[i] = scanner.nextInt();
        }

        Arrays.sort(numbersArr);

        for (int num : numbersArr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
