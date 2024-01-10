class Honda{
    final void speed(){
        System.out.println("speed is too Fast of Honda Bike");
    }
}
class Hero extends Honda{


    //Can not override the final method 

    /*
     final void speed(){  
        System.out.println("speed is too Fast of Honda Bike");
    }
    */

}
public class OverrideFinal {
    public static void main(String[] args) {
        Hero hf = new Hero();
        hf.speed();
    }
    
}
