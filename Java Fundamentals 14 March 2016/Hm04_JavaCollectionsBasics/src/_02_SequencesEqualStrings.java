import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_SequencesEqualStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] line = sc.nextLine().split(" ");
        // I can sort them. Like that the EQUAL elements will be one after one, but the words will be sorted by ASCII
//        Arrays.sort(line);
//
//        for (String word : line) {
//            System.out.print(word + " ");
//        }
        // Use .equals
        // !!!It works only if they are in a row!!!
        // If you sort them first, "hi" will not be on first plays.
        System.out.print(line[0] + " ");
        for (int i = 0; i < line.length - 1; i++) {
            String current = line[i];
            String next = line[i + 1];

            if (current.equals(next) == false) {
                System.out.println();
                System.out.print(next + " ");
            } else {
                System.out.print(next + " ");
            }
        }

        // That is how it works if they are not in a row //yes hi yes yes bye// if they are not a sequence
        // Making a list of unique elements
//        ArrayList<String> uniItems = new ArrayList<String>();
//        for (int i = 0; i < line.length; i++) {
//            if (uniItems.contains(line[i]) == false) {
//                uniItems.add(line[i]);
//            }
//        }
//
//        for (int i = 0; i < uniItems.size(); i++) {
//            for (int j = 0; j < line.length; j++) {
//                if (uniItems.get(i).equals(line[j])) {
//                    System.out.print(uniItems.get(i) + " ");
//                }
//            }
//            System.out.println();
//        }

        sc.close();
    }
}
