public class StaticNotUseThisAndSuper {
    static int variable = 10; // Static variable
    int nonStatic = 20;    // non static variable

    static void display(){
        // You cannot use 'this' in a static method
       // ==>  System.out.println(this.variable);

       System.out.println(variable); //it's allowed

       // You cannot use 'super' in a static method
      //   super.display();  // Compilation error: Cannot use 'super' in a static context

    }
    public  void main(String[] args) {
        display();
    }
}
