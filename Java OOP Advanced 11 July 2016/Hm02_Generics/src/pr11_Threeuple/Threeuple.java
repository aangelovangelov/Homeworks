package pr11_Threeuple;


public class Threeuple<K, V, E> extends Tuple<K, V>{

    private E element;

    public Threeuple(K key, V value, E element) {
        super(key, value);
        this.setElement(element);
    }

    public E getElement() {
        return element;
    }

    private void setElement(E element) {
        this.element = element;
    }
}
