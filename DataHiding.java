class Rectangle{
    private int length;
    private int breadth;

    public int getlength() {
        return length;
    }

    public void setlength(int l) {
        length = l;
    }

    // public int getBreadth(){
    //     return breadth;
    // }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int area() {
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setlength(12);
        r.setBreadth(5);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.getlength());
        
    }
}
