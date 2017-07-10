# Undo/Redo

## Usage

```java
UndoRedoExample undoRedoExample = new UndoRedoExample();
undoRedoExample.setUndoRedo(new UndoRedo<String>());
undoRedoExample.setData("First");
undoRedoExample.setData("Second");
undoRedoExample.setData("Third");
undoRedoExample.setData("Forth");
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.setData("New First");
undoRedoExample.setData("Second");
undoRedoExample.setData("Third");
undoRedoExample.setData("Forth");
Log.i(Constants.TAG, "current: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.redo();
Log.i(Constants.TAG, "redo: " + undoRedoExample.getData());
undoRedoExample.redo();
Log.i(Constants.TAG, "redo: " + undoRedoExample.getData());
undoRedoExample.redo();
Log.i(Constants.TAG, "redo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.setData("New Third");
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.undo();
Log.i(Constants.TAG, "undo: " + undoRedoExample.getData());
undoRedoExample.redo();
Log.i(Constants.TAG, "redo: " + undoRedoExample.getData());
undoRedoExample.redo();
Log.i(Constants.TAG, "redo: " + undoRedoExample.getData());
undoRedoExample.redo();
Log.i(Constants.TAG, "redo: " + undoRedoExample.getData());
undoRedoExample.redo();
Log.i(Constants.TAG, "redo: " + undoRedoExample.getData());
```