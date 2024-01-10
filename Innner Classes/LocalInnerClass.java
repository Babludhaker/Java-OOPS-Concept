class Outer{
    void Display() {
       final class Inner{
            void innerDisplay(){
                System.out.println("inner display method");
            }
        }
    
      // Create an instance of the local inner class
            // Inner i = new Inner();

       // Call the method of the local inner class
            // i.innerDisplay();

        //   this are also valid Anonymous Object to call 
            new Inner().innerDisplay();

    }

}
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer o  =new Outer();
        o.Display();
    }
}
