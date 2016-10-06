package pr07_CustomList;

public interface CustomList<T> {

    void add(T element);

	T remove(int index);

	boolean contains(T element);

	void swap(int index1, int index2);

	int countGreaterThat(T element);

	T getMax();

	T getMin();

}
