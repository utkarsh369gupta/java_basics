interface aaa {
    int age = 26;   // final and static
    String area = "jaipur";

    void show();

    void config();
}

interface X {
    void hello();
}

interface Y extends aaa {
    void yhello();
}

class b implements aaa, X {
    public void show() {
        System.out.println("in b show");
    }

    public void config() {
        System.out.println("in b config");
    }

    public void hello() {
        System.out.println("in hello by x");
    }
}

public class moreinterface {
    public static void main(String[] args) {
        aaa obj = new b();
        obj.show();
        obj.config();
        System.out.println(aaa.area);
    }
}
