
public class Problem04PrintCharacters {

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++){
            System.out.print((char)('a' + i) + " ");
        }

        System.out.println();

        for (int i = 0; i < 26; i++) {
            char character = (char)('a' + i);
            System.out.print(character + " ");
        }

        System.out.println();

        for (int i = 0; i < 26; i++) {
            char character = 'a';
            char nextChar = (char)(character + i);
            System.out.print(nextChar + " ");
        }
    }
}
