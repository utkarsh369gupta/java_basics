// public class Hello {
//     public static void main(String[] args) {
//         // System.out.println(3+5);
//         // System.out.println(4+5);

//         // in all the below codes, values to the variable is known as literals.

//         // int a = 0b101;
//         // System.out.println(a);

//         // int aa = 10_00_00_000;
//         // System.out.println(aa);

//         // double b = 45;
//         // double bb = 12e10;

//         // char c = 'a';
//         // c++;
//         // System.out.println(c);

//         // System.out.println(7<5); // false

//         // byte b = 127;
//         // int a = 12;

//         // a = b; // in this line of code intensive typecasting has been used.
//         // b = a; // this will give an error as we are storing big data in small memory
//         // but we can do this by extensive typecasting.
//         // b = (byte) a; // here we have done extensive type casting.

//         // but what if the size of a is bigger than the size of byte. In that case it
//         // finds modulo of the number that is modulo with the size of range of the data
//         // type.
//         // byte ab = 12;
//         // int aabb = 257;
//         // ab = (byte) aabb;
//         // System.out.println(ab);

//         // byte a = 10;
//         // byte b = 30;
//         // int result = a * b;
//         // System.out.println(result);

//         // int num1 = 3;
//         // int num2 = 6;
//         // byte b = 127;
//         // short s = 445;
//         // long l = 23456l;

//         // int add = num1 + num2;
//         // System.out.println(num1);
//         // System.out.println(num1 + num2);
//         // System.out.println(add);

//         // double n = 5.6;
//         // float num = 5.6f; // if you do not use f at last it will give an error as it
//         // is by default double.
//         // System.out.println(num);

//         // boolean b = true;
//         // System.out.println(b);

//         // char c = 'u'; // you can only use unicode while declaring char.
//         // System.out.println(c);

//     }
// }

// /*
//  * nameing conventions :
//  * to write the name of class, we use PascalConvention
//  * to write the name of function, we use camelCaseConvention
//  */

// /*
//  * you can also write jshell in terminal and run some basic programms like:
//  * 2 + 5
//  * to print, type System.out.print("hello");
//  * to print, type System.out.print(4);
//  */

// /*
//  * java is platform independent, it means you can run your applications on any
//  * machine but the only condition is that machine should have JVM. Also JVM is
//  * platform dependent like you can not run jvm on ios.
//  * programmer writes java code and this code is converted into byte code by java
//  * compiler also known as javac.
//  * jvm only understand byte code.
//  * jvm + libraries become jre.
//  * java is WORA that is write once run anywhere.
//  */

// import java.util.Scanner;
// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("taking input from the user");
//         Scanner sc = new Scanner(System.in);
//         float aa = sc.nextFloat();
//         System.out.println(aa);

//         // String str = sc.next();
//         // System.out.println(str);

//         // boolean b1 = sc.hasNextInt();
//         // System.out.println(b1);

//         // System.out.println("enter number 1: ");
//         // int a = sc.nextInt();
//         // System.out.println("enter number 2: ");
//         // int b = sc.nextInt();
//         // int sum = a + b;
//         // System.out.print("sum of entered number is: ");
//         // System.out.print(sum);

//         // int a = 0;

//         // System.out.println("Hello");
//         // System.out.print(a);

//     }

// }

// import java.util.Scanner;

// public class Hello {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of subjects: ");
//         int n = sc.nextInt();
//         System.out.println("enter the maximum marks: ");
//         int max = sc.nextInt();
//         float sum = 0;
//         for (int i = 0; i < n; i++) {
//             System.out.print("enter marks in subject " + (i + 1) + ": ");
//             float a = sc.nextFloat();
//             sum += a;
//         }
//         System.out.println("Your percentage is: " + ((sum / (n * max)) * 100));
//     }
// }

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        float a = 7 / 4 * 9 / 2;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name: ");
        String n = sc.next();
        System.out.println("Hello "+n+", have a good day");
        sc.close();
    }
}
