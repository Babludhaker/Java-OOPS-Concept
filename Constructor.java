class Rectangle{
    private int length;
    private int breadth;


    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
        System.out.println(length*breadth);
    }
    public Rectangle () {
        length = 5;
        breadth = 4;
           System.out.println(length*breadth);
    }
}

public class Constructor {
    public static void main(String[] args) {
         Rectangle r = new Rectangle();
    }
   
}
