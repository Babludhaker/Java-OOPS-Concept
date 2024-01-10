class Parent{
    public static void Display(){
        System.out.println("inside parent class");
    }
}
class Child extends Parent{
    public static void Display(){
        System.out.println("Inside Subclass ");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.Display(); // call the override method of parent class and subclass method are hide 

        // Child c = new Child();
        // c.Display();{}
    }
}
