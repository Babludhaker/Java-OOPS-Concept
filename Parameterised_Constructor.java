class Parent{


    Parent() {
        System.out.println("Non-param Constructor");

    }

    Parent(int x) {
        System.out.println("Param Constructor"+x);
    }
}

class Child extends Parent{

    Child() {
        System.out.println(" child Non-param Constructor");

    }

    Child(int x) {
        System.out.println(" child Param Constructor");
    }


    Child(int x, int y) {
        super(x);
        System.out.println(" child Param Constructor"+y);
    }
}


public class Parameterised_Constructor {
    public static void main(String[] args) {
        Child c = new Child(10,20);
    }
    
}
