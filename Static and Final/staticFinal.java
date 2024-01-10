class A{
    static final int data;
   // data = 90; it is not allowed

    static {
     data = 90; //static final only initailze static block 
    }
}
public class staticFinal {

    public static void main(String[] args) {
        System.out.println(A.data);
    }
}
