public class MementoExample {

    private Memento<String> memento;
    private String data;

    public MementoExample() {}

    public void setMemento(Memento<String> memento) {
        this.memento = memento;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void backup() {
        if (memento == null) {
            return;
        }
        memento.save(data);
    }

    public void restore() {
        if (memento == null) {
            return;
        }
        data = memento.restore();
    }
}