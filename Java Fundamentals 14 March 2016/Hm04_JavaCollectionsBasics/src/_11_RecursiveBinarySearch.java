import java.util.Scanner;

public class _11_RecursiveBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int searchedNumber = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int checkingIndex = (arr.length - 1) / 2;
        while (true) {

            int numInArr = arr[checkingIndex];

            if (searchedNumber > numInArr) {
                if (checkingIndex == (arr.length - 1)) {
                    System.out.println(-1);
                    break;
                }
                checkingIndex += (arr.length - checkingIndex) / 2;
            } else if (searchedNumber < numInArr) {
                if (checkingIndex == 0) {
                    System.out.println(-1);
                    break;
                }
                checkingIndex = checkingIndex / 2;
            } else {
                System.out.println(checkingIndex);
                break;
            }
        }
        sc.close();
    }
}
