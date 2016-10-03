import java.util.Scanner;

public class _03_LargestSequenceEqualStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine().split(" ");

        String elementLongestSeq = strings[0];
        int countedElements = 1;
        int currentCounter = 1;
        for (int i = 0; i < strings.length - 1; i++) {
            String currentElement = strings[i];
            String nextElement = strings[i + 1];

            if (currentElement.equals(nextElement)) {
                currentCounter++;
            } else {
                currentCounter = 1;
            }

            if (currentCounter > countedElements) {
                countedElements = currentCounter;
                elementLongestSeq = currentElement;
            }
        }
        for (int i = 0; i < countedElements; i++) {
            System.out.print(elementLongestSeq + " ");
        }
        sc.close();
    }
}
