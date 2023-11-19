class A {
    int n;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void showb() {
            System.out.println("inside b");
        }
    }

    static class c {
        public void showc() {
            System.out.println("inside c");
        }
    }
}

class innerClass {
    public static void main(String[] args) {
        A o = new A();
        o.show();

        A.B obj = o.new B();
        obj.showb();

        A.c oj = new A.c();
        oj.showc();
    }
}