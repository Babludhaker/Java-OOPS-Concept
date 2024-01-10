 class Rectangle {
        public double length;
        public double breadth;

        public double area() {
            return length*breadth;
        }
    }

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 12;
        r.breadth = 10;
        System.out.println(r.area());
        }
    
}
