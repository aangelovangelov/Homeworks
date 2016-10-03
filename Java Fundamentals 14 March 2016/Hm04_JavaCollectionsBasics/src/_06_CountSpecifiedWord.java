import java.util.Scanner;

public class _06_CountSpecifiedWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String line = sc.nextLine().toLowerCase().split();
//        String word = sc.nextLine();
    //First
        // "Please ignore the character casing"
        // If that is wright, third answer is not correct
        // If we count "is" in the word`s, like in third answer, fourth answer is not correct too.
//        int counter = 0;
//        int startIndexOfTheWord = line.indexOf(word.toLowerCase());
//        while (startIndexOfTheWord != -1) {
//            counter++;
//
//            startIndexOfTheWord = line.indexOf(word.toLowerCase(), startIndexOfTheWord + 1);
//        }
//
//        System.out.println(counter);

        String[] line = sc.nextLine().toLowerCase().split("\\W+");
        String word = sc.nextLine().toLowerCase();
    //Second - the correct
        int counter = 0;

        for (int i = 0; i < line.length; i++) {
            if (word.equals(line[i])) {
                counter++;
            }
        }

        System.out.println(counter);
        sc.close();
    }
}
