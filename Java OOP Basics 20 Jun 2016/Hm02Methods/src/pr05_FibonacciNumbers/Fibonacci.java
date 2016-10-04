package pr05_FibonacciNumbers;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Long> numbers;

    public Fibonacci(int end) {
        this.numbers = new ArrayList<>();
        this.makeFibonaccis(end);
    }

    private void makeFibonaccis(int end) {
        this.numbers.add(0l);
        this.numbers.add(1l);
        for (int i = 0; i < end - 2; i++) {
            long currFib = this.numbers.get(this.numbers.size() - 1) + this.numbers.get(this.numbers.size() - 2);
            this.numbers.add(currFib);
        }
    }


    public List<Long> getNumbersInRange(int start, int end) {
        return this.numbers.subList(start, end);
    }
}
