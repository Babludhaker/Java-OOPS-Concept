class Outer{
    int x = 10;
    // Inner i =  new Inner(); it is allowed 

    class Inner{
        int y = 20;

        void innerDisplay() {
            System.out.println("x value is "+x);
            System.out.println("y value is "+y);
        }
    }

    void outerDisplay(){
        Inner i = new Inner(); //It is allowed 
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class Nested{
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
    }
}