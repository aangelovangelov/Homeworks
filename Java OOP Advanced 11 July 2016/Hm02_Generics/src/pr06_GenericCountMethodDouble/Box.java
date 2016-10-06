package pr06_GenericCountMethodDouble;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {

    private T data;

    public Box(T data) {
        this.setData(data);
    }

    public T getData() {
        return data;
    }

    private void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.getData().getClass().getName(), this.getData());
    }

    @Override
    public int compareTo(Box<T> box) {
        return this.data.compareTo(box.getData());
    }
}