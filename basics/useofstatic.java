// import java.util.*;

class Mobile{
    String brand;
    int prices;
    static String name;
    public void show(){
        System.out.println(brand + " : " + name);
    }
    public static void show1(){
        // System.out.println(obj.brand + " : " + obj.prices + " : " + name);
        System.out.println(4);
    }
}
public class useofstatic {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.show();
        Mobile.show1();
    }
}
