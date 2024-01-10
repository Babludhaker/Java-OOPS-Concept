class bike{
    final int speed; //blank Final Variable 
     final static int value;
   
    bike(){
        speed = 90; // only initialize in constructor
        System.out.println(speed);
    }

    static{ // only initialize static block 
        value = 45;
    }



}
public class ConstructorFinal {
    public static void main(String[] args) {
        new bike();
    }
  
}
