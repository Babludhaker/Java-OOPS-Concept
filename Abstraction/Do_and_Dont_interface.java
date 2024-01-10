interface Test{
     int x = 10;
    //abstract and public are by default you can not write 
    public  abstract void meth1();


  // private abstract void meth2();      //Method cannot be Priavte 


/* //It is NOt Allowed:----
    public  void meth3(){

    }
    */
  
    /*It is Allowed */
    public static void meth3(){
        System.out.println("meth3 is allowed ");
    }
    
}


interface Test2 extends Test{
    void meth6();
}
  
class myTemplate implements Test2{
    public void meth1(){}
 
    public void meth6(){}
    // public void meth4(){}
}
public class Do_and_Dont_interface {
    public static void main(String[] args) {
        System.out.println(Test.x);
        Test.meth3();
        System.out.println(Test2.x);
        Test2 t  = new myTemplate();
        t.meth5();
    }
}
