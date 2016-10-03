import java.io.*;

public class _03_CountCharacterTypes {

    public static void main(String[] args) {

        File file = new File("res/words.txt");
        File newFile = new File("res/count-chars.txt");
        int[] counters = new int[3];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            // Taking every single line from the input text
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Iteration about the string line by every character
                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);
                    // Counting the characters
                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                        counters[0]++;
                    } else if (character == '!' || character == ',' || character == '.' || character == '?') {
                        counters[1]++;
                    } else if (character == ' ') {
                        continue;
                    } else {
                        counters[2]++;
                    }
                }
            }

            // Making the new file
            FileWriter fileWriter = new FileWriter(newFile, true);
            // Printing in that file
            PrintWriter printWriter = new PrintWriter(fileWriter, true);

            printWriter.printf("Vowels: %d%n", counters[0]);
            printWriter.printf("Consonants: %d%n", counters[2]);
            printWriter.printf("Punctuation: %d", counters[1]);


        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
