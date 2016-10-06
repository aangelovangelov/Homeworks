package pr01_ListyIterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListyIterator implements Iterator<String>{

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

    public boolean move() {
        if (this.hasNext()) {
            this.incrementIndex();
            return true;
        }

        return false;
    }

    private void incrementIndex() {
        this.index++;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.elements.size() - 1;
    }

    @Override
    public String next() {
        String nextElement = this.getElements().get(this.getIndex());
        this.incrementIndex();
        return nextElement;
    }
}
