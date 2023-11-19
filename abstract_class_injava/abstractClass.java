// we can't create object of abstract class

abstract class SuperCar{
    public abstract void drive();
    public abstract void PlayMusic();
    public void fly(){
        System.out.println("Flying....");
    }
}
abstract class ecosport extends SuperCar{
    public void drive(){
        System.out.println("driving.....");
    }
}
class suv extends ecosport{
    public void PlayMusic(){
        System.out.println("PlayMusic...");
    }
}
class abstractClass{
    public static void main(String[] args) {
        ecosport obj = new suv();
        obj.drive();
        obj.fly();
        obj.PlayMusic();
    }
}