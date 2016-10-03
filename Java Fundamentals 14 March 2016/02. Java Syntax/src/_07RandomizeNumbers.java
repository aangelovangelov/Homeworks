import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class _07RandomizeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int biggerNum = scanner.nextInt();
        int smallerNum = scanner.nextInt();

        if (biggerNum < smallerNum){
            int conteiner = biggerNum;
            biggerNum = smallerNum;
            smallerNum = conteiner;
        } else if (biggerNum == smallerNum){
            System.out.println(biggerNum);
            return;
        }

        Random rnd = new Random();
        int[] arr = new int[biggerNum - smallerNum + 1];

        for (int i = 0; i < arr.length; i++) {
            // Making random number from smaller to bigger number
            int rndNum = rnd.nextInt(biggerNum - smallerNum + 1) + smallerNum;

            // Cheking if that random number is in the array
            boolean contains = false;//IntStream.of(arr).anyMatch(x -> x == rndNum);

            for (int j = 0; j < i; j++) {
                if (arr[j] == rndNum){
                    contains = true;
                }
            }

            if (contains) {
                i--;
                continue;
            } else{
                arr[i] = rndNum;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
