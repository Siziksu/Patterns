# The Strategy Pattern

Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

__FlyBehavior.java__
```java
public interface FlyBehavior {

    void fly();
}
```

__FlyWithWings.java__
```java
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I fly with wings");
    }
}
```

__DoesntFly.java__
```java
public class DoesntFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}
```

__Duck.java__
```java
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
```

__MallardDuck.java__
```java
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
```

__RubberDuck.java__
```java
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new DoesntFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
```
