import java.util.ArrayList;
import java.util.List;

public final class UndoRedo<T> {

    private List<T> data = new ArrayList<>();
    private int index;
    private int position;

    public UndoRedo() {}

    public void save(T value) {
        for (int i = data.size() - 1; i > position; i--) {
            data.remove(i);
            index--;
        }
        data.add(index++, value);
        position = data.size() - 1;
    }

    public T undo() {
        if (position > 0) {
            return data.get(--position);
        }
        position = -1;
        return null;
    }

    public T redo() {
        if (position == data.size() - 1) {
            return null;
        } else if (position < 0) {
            position = 0;
        }
        return data.get(++position);
    }

    public List<T> getList() {
        return data;
    }
}
