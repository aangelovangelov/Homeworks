import java.io.*;

public class _01_SumLines {

    public static void main(String[] args) {
        File file = new File("res/lines.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String inputLine = bufferedReader.readLine();
            while (inputLine != null) {
                int sumChars = 0;
                for (int i = 0; i < inputLine.length(); i++) {
                    sumChars += inputLine.charAt(i);
                }
                System.out.println(sumChars);

                inputLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.getMessage();
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
