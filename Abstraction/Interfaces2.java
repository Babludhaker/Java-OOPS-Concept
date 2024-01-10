class Phone{
   public void call(){
        System.out.println("Call to the Phone ");
    }

    public void sms() {
        System.out.println("sms to send another phone");
    }
}

interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void play();
    // void Pause();
    void stop();
}

class smartPhone extends Phone implements Camera,MusicPlayer{
   public void videoCall(){
        System.out.println("smartPhone can videoCall Provide");
    }

   public void click(){
        System.out.println("camera is Built for Click shot");
    }

    public  void record(){
        System.out.println("record for Video");
    }

    public void play(){
        System.out.println("Play Music ");
    }

    public void stop(){
        System.out.println("stop the music");
    }




}

public class Interfaces2 {
    public static void main(String[] args) {
        smartPhone sp = new smartPhone();
        Phone p  = sp;
        p.sms();
        

        //sp.click();
        sp.play();
        sp.call();
        sp.sms();
        sp.videoCall();


        // You cannot do this: Interface only Provide Impelments

        //Camera c = new Camera(); //Error
    }
}
