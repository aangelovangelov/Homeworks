package pr03_StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CostemStack implements Iterable<Integer> {

    private List<Integer> numbers;

    public CostemStack() {
        this.numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void push(Integer num) {
        this.numbers.add(num);
    }

    public Integer pop() {
        if (this.numbers.size() > 0) {
            return this.numbers.remove(this.numbers.size() - 1);
        }

        throw new UnsupportedOperationException("No elements");
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator(this.numbers);
    }
}
