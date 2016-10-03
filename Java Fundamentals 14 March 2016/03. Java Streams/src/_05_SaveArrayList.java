import java.io.*;
import java.util.ArrayList;

public class _05_SaveArrayList {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(323.3);
        list.add(23422.3);
        list.add(323.39909);
        list.add(331.3);
        list.add(3343.34343);

        File file = new File("res/double.list");
        //File file = new File("res/double.list.txt"); If look in res folder will found double.list.txt with binary presentation
        //of source code. That's looks like the code after the java comparator goes on the code. This is .class files looks like!!!


        // Making the file and write the ArrayList in it in bite code!!!
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)))) {

            oos.writeObject(list);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading the file and printing him on the console. JVM is care to view the information property!!!
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)))) {

            System.out.println(ois.readObject());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
