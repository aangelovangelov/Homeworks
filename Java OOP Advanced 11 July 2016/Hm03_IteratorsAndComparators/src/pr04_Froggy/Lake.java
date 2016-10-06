package pr04_Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake<E> implements Iterable<E> {

    private List<E> elements;

    public Lake(List<E> elements) {
        this.setElements(elements);
    }

    public List<E> getElements() {
        return elements;
    }

    private void setElements(List<E> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<E> iterator() {
        return new FroggIterator();
    }

    private class FroggIterator implements Iterator<E> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index >= elements.size() && index % 2 == 0) {
                index = 1;
            }

            return index < elements.size();
        }

        @Override
        public E next() {
            E elementForReturn = elements.get(this.index);
            this.index += 2;
            return elementForReturn;
        }
    }
}
