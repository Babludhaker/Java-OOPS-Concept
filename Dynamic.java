class Super{
    void display() {
        System.out.println("Super class ");

    }
     void meth(){
        System.out.println("meth 1");  //this will excuted
    }
}

class Sub extends Super{
    void display() {
        System.out.println("Sub Class ");
    }
    /*void meth(){
        System.out.println("meth 1");  //this will  not excuted without super class in this method define 
    } */
   
}
public class Dynamic {
    public static void main(String[] args) {
        Super su = new Sub();
        su.display();
        su.meth();

        
    }
}
