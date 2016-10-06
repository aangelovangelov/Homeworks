package pr03_StackIterator;

import java.util.Iterator;
import java.util.List;

public class StackIterator implements Iterator<Integer> {

    private List<Integer> numbers;
    private int currIndex;

    public StackIterator(List<Integer> numbers) {
        this.setNumbers(numbers);
        this.setCurrIndex();
    }

    private void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    private void setCurrIndex() {
        this.currIndex = this.numbers.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return this.currIndex >= 0;
    }

    @Override
    public Integer next() {
        return this.numbers.get(this.currIndex--);
    }
}
