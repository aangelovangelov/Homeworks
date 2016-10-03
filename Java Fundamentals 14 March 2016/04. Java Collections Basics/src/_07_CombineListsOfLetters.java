import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _07_CombineListsOfLetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        ArrayList<Character> charArr1 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char character = str1.charAt(i);
            charArr1.add(character);
        }
        String str2 = sc.nextLine();
        ArrayList<Character> charArr2 = stringToCharacterList(str2);
//        charArr1.removeAll(Arrays.asList(' '));
//        System.out.println(charArr1);

        //NO!!!
//        for (int i = 0; i < charArr2.size(); i++) {
//            if (!charArr1.contains(charArr2.get(i))) {
//                charArr1.add(' ');
//                charArr1.add(charArr2.get(i));
//            }
//        }
//        for (Character character : charArr1) {
//            System.out.print(character);
//        }

        ArrayList<Character> output = new ArrayList<>();
        for (int i = 0; i < charArr1.size(); i++) {
            output.add(charArr1.get(i));
        }
        for (int i = 0; i < charArr2.size(); i++) {
            if (!charArr1.contains(charArr2.get(i))) {
                output.add(' ');
                output.add(charArr2.get(i));
            }
        }

        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
        }


        sc.close();
    }

    static ArrayList<Character> stringToCharacterList(String string) {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            char simbol = string.charAt(i);
            characters.add(simbol);
        }
        return characters;
    }
}
