
class aa {
    public void show() {
        System.out.println("this will only show");
    }
}

abstract class car {
    public abstract void drive();
}

public class anonymousinnerClass {
    public static void main(String[] args) {
        aa obj = new aa() {
            public void show() {
                System.out.println("this is anoaymouse inner class.");
            }
        };
        obj.show();

        car oj = new car() {
            public void drive() {
                System.out.println("Driving...");
            }
        };
        oj.drive();
    }
}