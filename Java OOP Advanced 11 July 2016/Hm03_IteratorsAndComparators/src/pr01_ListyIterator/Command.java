package pr01_ListyIterator;

import java.util.NoSuchElementException;

public class Command {

    public static void execute(ListyIterator listyIterator, String command) {
        switch (command.toLowerCase()) {
            case "hasnext":
                System.out.println(listyIterator.hasNext());
                break;

            case "print":
                try {
                    System.out.println(listyIterator.print());
                } catch (NoSuchElementException ex) {
                    System.out.println(ex.getMessage());
                }
                break;

            case "move":
                System.out.println(listyIterator.move());
                break;

            default:
                break;
        }
    }

}
