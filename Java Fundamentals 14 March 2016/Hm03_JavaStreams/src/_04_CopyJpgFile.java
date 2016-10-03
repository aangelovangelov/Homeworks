import java.io.*;

public class _04_CopyJpgFile {

    public static void main(String[] args) {
        File picture = new File("res/picture.jpg");
        File copyPicture = new File("res/my-copied-picture.jpg");

        try (FileInputStream inputStream = new FileInputStream(picture)) {
            FileOutputStream outputStream = new FileOutputStream(copyPicture);
            //byte[] buffer = new byte[1024*20];
            int bytesRead = inputStream.read();//(buffer);
            while (bytesRead != -1) {
                //outputStream.write(buffer);
                outputStream.write(bytesRead);
                bytesRead = inputStream.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
