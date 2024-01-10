class Circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

}

class Cylinder extends Circle{
    public double height;

    public double volume() {
        return area()*height;
    }

}

public class Inheritance {
 public static void main(String[] args) {
    Circle c1 = new Circle();
    Cylinder c2 = new Cylinder();

    c2.height = 12;
    c2.radius = 5;

    System.out.println(c2.volume());
    System.out.println(c2.area());
 }
}
