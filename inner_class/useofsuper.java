class a{
    public a(){
        System.out.println("int constructor a");
    }
    public a(int n){
        System.out.println("int constructor a with parameter");
    }
}
class b extends a{
    public b(){
        super(5);
        System.out.println("int constructor b");
    }
    public b(int n){
        // this();
        super(n);
        System.out.println("int constructor b with parameter");
    }
    public void display(){
        System.out.println("inside display of b");
    }
}

public class useofsuper {
    public static void main(String[] args) {
        b obj = new b(6);
        obj.display();
    }
}
