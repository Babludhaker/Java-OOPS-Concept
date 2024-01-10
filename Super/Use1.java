package Super;
class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void printName() {
        System.out.println("They are refer to this class String name :"+name); // They are refer to this class String name
        System.out.println("they are refer to the parent class String name :" +super.name); // they are refer to the parent class String name
    }
}

public class Use1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printName();
    }

}

