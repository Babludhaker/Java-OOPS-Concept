package myPack;

public class SubDemo extends Demo {
    private int e = 50;

    public void displaySub() {
        System.out.println("Subclass Value: " + e);
    }

    public void displayAll() {
        System.out.println("Values from superclass: " + a + ", " + b + ", " + c + ", " + d);
        System.out.println("Value from subclass: " + e);
    }
}
