# The Factory Pattern

Factory pattern is one of most used design pattern in Java. This type of design pattern is a __creational pattern__ as this pattern provides one of the best ways to create an object.

In Factory pattern, we create objects without exposing the creation logic to the client and refer to newly created object using a common interface.

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
        System.out.println("Inside Circle::draw method");
    }
}
```

__Rectangle.java__
```java
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw method");
    }
}
```

__Square.java__
```java
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw method");
    }
}
```

__ShapeFactory.java__
```java
public class ShapeFactory {

    public static final CIRCLE = 0;
    public static final RECTANGLE = 1;
    public static final SQUARE = 2;

    public Shape getShape(String shapeType) {
        if(shapeType == CIRCLE) {
            return new Circle();
        } else if(shapeType == RECTANGLE) {
            return new Rectangle();
        } else if(shapeType == SQUARE) {
            return new Square();
        }
        return null;
    }
}
```

__Main.java__
```java
public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        circle.draw();
        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        rectangle.draw();
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        square.draw();
    }
}
```

__Output:__
```
Inside Circle::draw method
Inside Rectangle::draw method
Inside Square::draw method
```
