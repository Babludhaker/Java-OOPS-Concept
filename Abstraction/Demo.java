// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calling abstract and concrete methods
        circle.display();
        System.out.println("Area of the circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}
