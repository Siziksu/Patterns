# Memento

## Usage

```java
MementoExample mementoExample = new MementoExample();
mementoExample.setMemento(new Memento<>());
mementoExample.setData("First");
mementoExample.setData("Second");
Log.i(Constants.TAG, "backup: " + mementoExample.getData());
mementoExample.backup();
mementoExample.setData("Third");
mementoExample.setData("Forth");
Log.i(Constants.TAG, "last: " + mementoExample.getData());
mementoExample.restore();
Log.i(Constants.TAG, "restore: " + mementoExample.getData());
```