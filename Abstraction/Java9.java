interface Example{
    private void meth4(){
        System.out.println("meth4 is Private");
    }
    default void meth5(){
        meth4();
    }
}
public class Java9 implements Example {

    public static void main(String[] args) {
         Example e = new Java9();
       e.meth5();

        
    }
}
