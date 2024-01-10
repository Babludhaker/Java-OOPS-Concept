abstract class My{
    abstract void Display();
}
//Even IF a Interface 

interface Outer{
    void meth1();
}

public class Anonymous {

    public static void main(String[] args) {

        int y = 20;
        
     // This syntex are Anonymous class 
        My m = new My() { 
            public void Display(){
                System.out.println("Anonymous class is Created to abstract class ");
                System.out.println("y value is "+z);
            }
            
        };
        m.Display();

        //Anonymous class to Implement Interface
        Outer o = new Outer() {
            public void meth1(){
                System.out.println("this are anonymous class to implementing in interface");
            }
        };
        o.meth1();

       
    }
}
