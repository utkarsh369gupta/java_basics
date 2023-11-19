
interface computer {
    void code();
}

class Laptop implements computer {
    public void code() {
        System.out.println("code, compile, run..");
    }
}

class Desktop implements computer {
    public void code() {
        System.out.println("code, compiler, run : faster");
    }
}

class Developer {
    public void devApp(computer lap) {
        lap.code();
    }
}

public class interfaceInJava {
    public static void main(String[] args) {
        computer a = new Laptop();
        computer b = new Desktop();

        Developer d = new Developer();
        d.devApp(b);
        d.devApp(a);
    }
}
