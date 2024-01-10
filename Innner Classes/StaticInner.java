class Outer{
    static int x   = 10;
   static int y =20;

   //This are Static Inner class 
    static class My{
        public void show(){
            System.out.println(x+" "+y);
        }
        
    }

}
public class StaticInner {
    public static void main(String[] args) {
        //Static inner class Can create and call 
        Outer.My m  = new Outer.My();
        m.show();
        
    }
}
