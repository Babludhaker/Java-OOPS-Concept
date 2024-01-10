import java.util.*;

abstract  class Shape{  // abstract final yaa static class Shape is not valid 
  //static  int  constant = 10; // it is Valid 
  //static  int  constant = 10; // it is valid
     abstract   public double peremiter(double l, double b);

     abstract public double area(double l, double  b);
}



class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double peremiter(double l, double b) {
        return 2*(length+breadth);
    }

    public double area(double l, double b) {
        return length*breadth;
    }
}
public class First{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12,5);
       

        System.out.println(r.area(r.length,r.breadth));
        System.out.println(r.peremiter(r.length, r.breadth));
    }
}