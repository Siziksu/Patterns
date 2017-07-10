# The Observer Pattern

Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

There is a Obserable and the Observers. We call the publisher the Obserable and the subscribers the Observers.

__Observable.java__
```java
public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
```

__ObservableImpl.java__
```java
public class ObservableImpl implements Observable {

    private List<Observer> list = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        if (!list.contains(observer)) {
            list.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (list.contains(observer)) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}
```

__Observer.java__
```java
public interface Observer {

    void update();
}
```

__ObserverImpl.java__
```java
public class ObserverImpl implements Observer {

    @Override
    public void update() {
        System.out.println("Update");
    }
}
```
