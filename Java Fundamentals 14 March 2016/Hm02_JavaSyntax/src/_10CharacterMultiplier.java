import java.util.Scanner;

public class _10CharacterMultiplier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.next();
        String secondStr = sc.next();

        long multipliedStrings = characterMultiply(firstStr, secondStr);

        System.out.println(multipliedStrings);

        sc.close();
    }


    static long characterMultiply(String str1, String str2){
        long sum = 0;

        int lenghtOfSmallerStr = str1.length();
        if (str2.length() < str1.length()){
            lenghtOfSmallerStr = str2.length();
        }

        for (int i = 0; i < lenghtOfSmallerStr; i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }

        if (lenghtOfSmallerStr < str1.length()){
            for (int i = lenghtOfSmallerStr; i < str1.length(); i++) {
                sum += str1.charAt(i);
            }
        }
        if (lenghtOfSmallerStr < str2.length()){
            for (int i = lenghtOfSmallerStr; i < str2.length(); i++) {
                sum += str2.charAt(i);
            }
        }
        return sum;
    }
}
