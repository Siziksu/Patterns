public class Memento<T> {

    private T data;

    public Memento() {}

    public void save(T data) {
        this.data = data;
    }

    public T restore() {
        return data;
    }
}
