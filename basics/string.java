// import java.util.Scanner;

// public class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // System.out.println("enter name: ");
//         String a = sc.nextLine();
//         System.out.println(a.contains("  "));
//         System.out.println("Dear " + a + ", Thanks a lot.");
//         System.out.println(a.replace(" ","_"));
//         System.out.println(a.toLowerCase());
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class string {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // String st = sc.nextLine();
//         // String str2 = sc.next();
//         // System.out.println(st);
//         // System.out.println(str2);

//         // String name = new String("boss");
//         // // String name = "utkarsh gupta";
//         // // strings are immutable
//         // System.out.println(name);

//         // int a = 6;
//         // float b = 5.6f;
//         // System.out.printf("The value of a is %d and value of b is %8.2f.", a, b);
//         // System.out.format("The value of a is %d and value of b is %f.", a, b);

//         // some of the method on the strings:
//         String name = "Utkarsh";
//         String st = " Boss";
//         System.out.println(name.length());
//         System.out.println(name.toLowerCase());
//         System.out.println(name.toUpperCase());
//         System.out.println(name.concat(st));
//         System.out.println(st.trim()); //remove all the spaces in string.
//         System.out.println(name.substring(1, 4));
//         System.out.println(name.replace("h", "p"));
//         System.out.println(name.startsWith("Ut"));
//         System.out.println(name.endsWith("sh"));
//         System.out.println(name.charAt(0));
//         System.out.println(name.indexOf("t"));
//         System.out.println(name.lastIndexOf("s"));
//         System.out.println(name.equals("utkarsh"));
//     }
// }

// import java.util.Scanner;
// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String st = sc.next();
//         System.out.println("original: "+ st);
//         System.out.println("new: "+ inc(st,2));
//         sc.close();
//     }
//     static String inc(String st, int n){
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < st.length(); i++) {
//             char ch = st.charAt(i);
//             char newch = (char) (ch + n);
//             if (newch > 'z'){
//                 newch = (char) ('a' + newch - 'z' - 1) ;
//             }
//             result.append(newch);
//         }
//         return result.toString();
//     }
// }

// import java.util.Scanner;
// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String st = sc.next();

//         System.out.println("original string: " + st);
//         System.out.println("new string: " + rotate(st, 2));
//     }
//     public static String rotate(String st, int n){
//         return st.substring(n)+st.substring(0, n);
//     }
// }

// import java.util.*;

// public class string {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         Arrays.toString(args);
//         System.out.println(arr);


//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // String[] arr = { "utkarsh", "boss", "hello", "khushi", "intelligent", "beautiful" };
//         // int maxlength = 0;
//         // for(String i: arr){
//         //     if(maxlength< i.length()){
//         //         maxlength = i.length();
//         //     }
//         // }
//         // System.out.println(maxlength);
//     }
// }

