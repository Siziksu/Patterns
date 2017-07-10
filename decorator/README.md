# The Decorator Pattern

Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. Is an __structural pattern__ as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

__Shape.java__
```java
public interface Shape {

    void draw();
}
```

__Circle.java__
```java
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
```

__Rectangle.java__
```java
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
```

__ShapeDecorator.java__
```java
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }	
}
```

__RedShapeDecorator.java__
```java
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);		
    }

    @Override
    public void draw() {
        super.draw();
        printRedBorder();
    }

    private void printRedBorder(){
        System.out.println("Border Color: Red");
    }
}
```

__RedShapeDecorator.java__
```java
public class BlueBackgroundShapeDecorator extends ShapeDecorator {

    public BlueBackgroundShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        printBlueBackgroundBorder();
    }

    private void printBlueBackgroundBorder(){
        System.out.println("Background Color: Blue");
    }
}
```

__Main.java__
```java
public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape redRectangleBackgroundBlue = new RedShapeDecorator(new BlueBackgroundShapeDecorator(new Rectangle()));
        circle.draw();
        System.out.println();
        redCircle.draw();
        System.out.println();
        redRectangle.draw();
        System.out.println();
        redRectangleBackgroundBlue.draw();
    }
}
```

__Output:__
```
Shape: Circle

Shape: Circle
Border Color: Red

Shape: Rectangle
Border Color: Red

Shape: Rectangle
Background Color: Blue
Border Color: Red
```
