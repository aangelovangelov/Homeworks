import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11GetOddEvenElements {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String[] line1 = scaner.nextLine().split(" ");
        String[] line2 = scaner.nextLine().split(" ");

        int[] arr = new int[line1.length];
        for (int i = 0; i < line1.length; i++) {
            arr[i] = Integer.parseInt(line1[i]);
        }

        int numberOfElements = Integer.parseInt(line2[1]);
        String oddOrEven = line2[2];

        List<Integer> outputList = getElements(arr, numberOfElements, oddOrEven);

        for (int i = 0; i < outputList.size(); i++) {
            System.out.print(outputList.get(i) + " ");
        }

        scaner.close();
    }

    static List<Integer> getElements(int[] array, int numberOfElements, String oddOrEven) {
        List<Integer> list = new ArrayList<>();

        if (oddOrEven.equals("odd")) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    list.add(array[i]);
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    list.add(array[i]);
                }
            }
        }

        if (numberOfElements < list.size()) {
            int diff = list.size() - numberOfElements;

            for (int i = list.size() - 1; i >= numberOfElements; i--) {
                list.remove(i);
            }
        }
        return list;
    }
}
