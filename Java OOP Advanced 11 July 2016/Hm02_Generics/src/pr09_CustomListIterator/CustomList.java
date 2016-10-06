package pr09_CustomListIterator;

import java.util.Comparator;

public interface CustomList<T> extends Iterable<T> {

    void add(T element);

	T remove(int index);

	boolean contains(T element);

	void swap(int index1, int index2);

	int countGreaterThat(T element);

	T getMax();

	T getMin();

	int getSize();

	T getElement(int index);
}
