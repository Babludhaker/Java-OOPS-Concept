class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("the lenght is "+length);
        System.out.println("the breadth is "+breadth);
    }
}
public class This {
    public static void main(String[] args) {
        Rectangle r3 = new Rectangle(12,23);
        r3.display();
    }
}
