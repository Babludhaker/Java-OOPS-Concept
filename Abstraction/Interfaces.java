interface Test{
    void meth1();
    void meth2();
    int a = 13;   // Implicitly public, static, and final
    public static void meth4(){
        System.out.println("static method body are allowed  ");
    }
}
class myTest implements Test{
   public void meth1() {
        System.out.println("Meth1 is override");
        // a = 18;


    }

   public  void meth2() {
        System.out.println("meth 2 is override");
    }
    
    public void meth3(){
        System.out.println("meth3 is Create ");
    }
    
}
public class Interfaces {
    public static void main(String[] args) {
        myTest t = new myTest();
        t.meth1();
        t.meth2();
        t.meth3();
        System.out.println(t.a);
        Test.meth4();
            
        
    }
}
