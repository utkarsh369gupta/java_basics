import java.util.Scanner;

public class recursionInJava {
    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}


// import java.util.Scanner;

// public class recursionInJava {
//     static int fibonacci(int n) {
//         if (n == 1) {
//             return 0;
//         } else if (n == 2) {
//             return 1;
//         } else {
//             return fibonacci(n - 1) + fibonacci(n - 2);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             System.out.print(fibonacci(i) + " ");
//         }
//     }
// }

// public class recursionInJava {
// static int factorial(int n) {
// if (n == 0 || n == 1) {
// return 1;
// } else {
// return n * factorial(n - 1);
// }
// }

// public static void main(String[] args) {
// System.out.println(factorial(6));
// }
// }
