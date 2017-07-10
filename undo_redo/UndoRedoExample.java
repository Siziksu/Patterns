import android.util.Log;

import com.nestle.nescafe.dolcegusto.loyaltyapp.common.Constants;

import java.util.List;

public final class UndoRedoExample {

    private UndoRedo<String> undoRedo;
    private String data;

    public UndoRedoExample() {}

    public void setUndoRedo(UndoRedo<String> undoRedo) {
        this.undoRedo = undoRedo;
    }

    public void setData(String data) {
        this.data = data;
        if (undoRedo != null) {
            undoRedo.save(data);
            printList();
        }
    }

    public String getData() {
        return data == null ? "" : data;
    }

    public void undo() {
        if (undoRedo == null) {
            return;
        }
        String result = undoRedo.undo();
        if (result == null) {
            return;
        }
        data = result;
    }

    public void redo() {
        if (undoRedo == null) {
            return;
        }
        String result = undoRedo.redo();
        if (result == null) {
            return;
        }
        data = result;
    }

    private void printList() {
        List<String> list = undoRedo.getList();
        Log.i(Constants.TAG, list.toString() + " current: " + list.get(list.size() - 1));
    }
}