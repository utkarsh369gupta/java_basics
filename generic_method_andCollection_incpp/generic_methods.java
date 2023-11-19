import java.util.ArrayList;
// import java.util.Scanner;

class MyGeneric<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getval() {
        return val;
    }

    public void setval(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class generic_methods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // // ArrayList<int> arrayList = new ArrayList(); // this is invalid. we can
        // only use class.
        // arrayList.add("boss");
        arrayList.add(26);
        arrayList.add(9);
        arrayList.add(8);
        // arrayList.add(new Scanner(System.in));

        // int a = (int) arrayList.get(2);
        // System.out.println(a);

        MyGeneric<String, Integer> o = new MyGeneric<>(26, "boss", 6);

        System.out.println(o.getT1());
        System.out.println(o.getT2());
    }
}
