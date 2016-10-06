package pr03_GenericSwapMethodString;

import java.util.Collections;
import java.util.List;

public class Swapper<T> {

    private List<T> data;

    public Swapper(List<T> data) {
        this.data = data;
    }

    public <T> void swap(int index, int indexSwappingWith) {
        Collections.swap(this.data, index, indexSwappingWith);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T item : data) {
            sb.append(String.format("%s: %s%n", item.getClass().getName(), item));
        }

        return sb.toString();
    }
}
