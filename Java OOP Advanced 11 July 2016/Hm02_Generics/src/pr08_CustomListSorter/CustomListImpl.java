package pr08_CustomListSorter;


import _07_generics._07_customList.interfaces.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomListImpl<T extends Comparable<T>> implements CustomList<T> {

    List<T> elements;

    public CustomListImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return this.elements.size();
    }

    @Override
    public T getElement(int index) {
        return this.elements.get(index);
    }

    @Override
    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public T remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    @Override
    public void swap(int index1, int index2) {
        Collections.swap(this.elements, index1, index2);
    }

    @Override
    public int countGreaterThat(T element) {
        int count = 0;

        for (T el : this.elements) {
            if (el.compareTo(element) > 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public T getMax() {
        return this.elements.stream()
                .max((el1, el2) -> el1.compareTo(el2))
                .get();
    }

    @Override
    public T getMin() {
        return this.elements.stream()
                .min(Comparable::compareTo)
                .get();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.elements.size(); i++) {
            sb.append(this.elements.get(i));
            if (i < this.elements.size() - 1) {
                sb.append(System.lineSeparator());
            }
        }

        return sb.toString();
    }

}
