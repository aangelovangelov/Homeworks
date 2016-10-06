package pr01_GenericBox;

public class Box<T> {

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
}