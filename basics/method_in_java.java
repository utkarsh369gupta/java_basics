public class method_in_java {
    static void change(int x) {
        x = 69;
        // return x;
    }
    static void change2(int[] arr) {
        arr[0] = 69;
        // return x;
    }

    public static void main(String[] args) {
        // int a = 5;
        // change(a);
        // System.out.println(a);

        int[] arr = {1,2,3,4};
        change2(arr);
        System.out.println(arr[0]);
    }
}

// public class method_in_java {
// static int logic(int x, int y) {
// int z;
// x = 3;
// if (x > y) {
// z = x + y;
// } else {
// z = (x + y) * 5;
// }
// return z;
// }

// public static void main(String[] args) {
// int a = 5;
// int b = 4;
// int c = logic(a, b);
// System.out.println(c);
// System.out.println(a);

// }
// }
