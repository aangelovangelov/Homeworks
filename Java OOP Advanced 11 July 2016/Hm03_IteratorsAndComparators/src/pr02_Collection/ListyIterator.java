package pr02_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListyIterator implements Iterable<String>{

    private List<String> elements;
    private int index;

    public ListyIterator(List<String> elements) {
        this.setElements(elements);
        this.setIndex(0);
    }

    public int getIndex() {
        return index;
    }

    private void setIndex(int index) {
        this.index = index;
    }

    public List<String> getElements() {
        return elements;
    }

    private void setElements(List<String> elements) {
        this.elements = elements;
    }

    public String print() {
        if (this.elements.size() == 0) {
            throw new NoSuchElementException("Invalid Operation!");
        }

        return this.elements.get(this.index);
    }

    public String printAll() {
        StringBuilder sb = new StringBuilder();
        for (String element : this.elements) {
            sb.append(element + " ");
        }

        return sb.toString();
    }

    public boolean move() {
        if (this.iterator().hasNext()) {
            this.incrementIndex();
            return true;
        }

        return false;
    }

    private void incrementIndex() {
        this.index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return index < elements.size() - 1;
            }

            @Override
            public String next() {
                String nextElement = getElements().get(getIndex());
                incrementIndex();
                return nextElement;
            }
        };
    }
}
