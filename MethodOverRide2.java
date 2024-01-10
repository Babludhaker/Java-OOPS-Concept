class Tv{
    void SwitchOn(){System.out.println("Tv is Switch ON");}

    void channelChange(){System.out.println("TV Channel is Changed");}
}

class SmartTv extends Tv{
   void SwitchOn(){System.out.println("SmartTv is Switch ON");}

    void channelChange(){System.out.println("SnartTV Channel is Changed");}
    void Browse(){System.out.println("Browsing are Support");}

}
public class MethodOverRide2 {
    public static void main(String[] args) {
    // Tv t = new Tv();
    // t.SwitchOn();

//This Browse Method are not define The Tv Class it mean only those access is are declared in Tv Refference Class 
    Tv t  = new SmartTv();
    t.SwitchOn();
    // t.Browse();
    }


    
}
