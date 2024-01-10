class A 
{ 
    public A(int x){} 

    // public A(){}
} 
class B extends A { } 
public class file 
{ 
    public static void main (String args []) 
    {
        A a = new B(); 
        System.out.println("complete"); 
    } 
}