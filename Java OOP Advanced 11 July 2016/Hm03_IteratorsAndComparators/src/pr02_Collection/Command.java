package pr02_Collection;

import java.util.NoSuchElementException;

public class Command {

    public static void execute(ListyIterator listyIterator, String command) {
        switch (command.toLowerCase()) {
            case "hasnext":
                System.out.println(listyIterator.iterator().hasNext());
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

            case "printall":
                System.out.println(listyIterator.printAll());
                break;

            default:
                break;
        }
    }

}
