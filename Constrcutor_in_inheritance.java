class Parent {

    public Parent() {
        System.out.println("Parent Constructor");

    }
}

class Child extends Parent {

    public Child() {
        System.out.println("child Constructor");

    }
}

public class Constrcutor_in_inheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        // Child c = new Child();
    }

}
