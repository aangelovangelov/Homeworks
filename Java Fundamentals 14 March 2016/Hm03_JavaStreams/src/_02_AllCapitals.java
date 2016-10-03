import java.io.*;

public class _02_AllCapitals {

    public static void main(String[] args) {
        File fileInput = new File("res/lines.txt");
        File fileOutput = new File("res/linesUpperCase.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInput))) {
            String inputLine = bufferedReader.readLine();
            while (inputLine != null) {
                FileWriter fileWriter = new FileWriter(fileOutput, true);
                PrintWriter printWriter = new PrintWriter(fileWriter, true);
                // If printWriter.print(...); will not flush automatically.You must write printWriter.flush() after that;
                printWriter.println(inputLine.toUpperCase());

                inputLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.getMessage();
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
