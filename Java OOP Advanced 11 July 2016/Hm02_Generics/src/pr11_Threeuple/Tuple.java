package pr11_Threeuple;

public class Tuple<K, V> {

    private K key;

    private V value;

    public Tuple(K key, V value) {
        this.setKey(key);
        this.setValue(value);
    }

    public K getKey() {
        return key;
    }

    private void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    private void setValue(V value) {
        this.value = value;
    }
}
