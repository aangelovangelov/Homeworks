package pr08_CustomListSorter;

import _07_generics._07_customList.interfaces.CustomList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Sorter<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(CustomList<T> list) {

        for (int i = 0; i < list.getSize(); i++) {
            T element1 = list.getElement(i);

            for (int j = i + 1; j < list.getSize(); j++) {
                T element2 = list.getElement(j);

                if (element1.compareTo(element2) > 0) {
                    list.swap(i, j);
                }
            }
        }
    }
}
