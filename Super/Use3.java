package Super;
class Animal3{
    void makeSound() {
        System.out.println("Animal make a Sound");
    }
}
class Dog3 extends Animal3{
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Dog are sound Barks");
    }

}
public class Use3 {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.makeSound();
    }
    
}
