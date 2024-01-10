interface Member{
    void callBack();
}

class Store{
   Member members[] = new Member[10];
   int count = 0;

   void register(Member m) {
    members[count++] = m;
   }

   void inviteSale() {
    for(int i=0; i<count; i++){
        members[i].callBack();
    }
   }
}

class customer implements Member{
    String name;
    customer(String n) {
        name = n;
    }

    public void callBack() {
        System.out.println("ok i will visit "+name);
    }
}
public class ChallengesInterFaces {
    public static void main(String[] args) {
        Store s = new Store();
        customer c = new customer("Bablu");
        customer c2 = new customer("kanu");
        s.register(c);
        s.register(c2);
        s.inviteSale();

    }
}
