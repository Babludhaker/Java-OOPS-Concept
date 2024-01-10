

class Super{

        public void said() {
            System.out.println("hello");
        }

    }
    class Sub extends Super{
      public  void said(String name) {
            System.out.println("hello Bablu");
        }
    }


public class MethodOverRide {
    public static void main(String[] args) {
        Super su = new Sub();
        su.said();
    }
    
}
