package Super;
class animal{
    int age;

    animal( int age){
        this.age = age;
        System.out.println("Parent Const animal");

    }
}
class Cat extends animal{
    String breed;

    Cat(String breed, int age) {
        super(age);
        this.breed = breed;
        System.out.println(age);

    }

}
public class Use2 {
    public static void main(String[] args) {
        Cat c = new Cat("Grass", 12);
        // animal a = new animal(12);
    }
}
