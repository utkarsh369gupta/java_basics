// public class if_else {
//     public static void main(String[] args) {
//         int n = 1;
//         if (n == 26) {
//             System.out.println(n);
//         } else if (n == 13) {
//             System.out.println("papa birthday!!");
//         } else {
//             System.out.println("number is not 26");
//             System.out.println("Utkarsh is a boss");
//         }
//     }
// }

// ternary operator

// public class if_else {
//     public static void main(String[] args) {
//         int n = 52;
//         int result;
//         result = (n % 2 == 0) ? 10 : 20;
//         System.out.println(result);
//     }
// }

// switch statement

// public class if_else {
//     public static void main(String[] args) {
//         int n = 21;
//         switch (n) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("enter valid number");
//         }
//     }
// }

// public class if_else {
//     public static void main(String[] args) {
//         String day = "Sunday";
//         switch(day)
//         {
//             case "Saturday", "Sunday" -> System.out.println("6am");

//             case "Monday" -> System.out.println("8am");

//             default -> System.out.println("7am");
//         }
//     }
// }

// public class if_else {
//     public static void main(String[] args) {
//         String day = "Sunday";
//         String result;
//         result = switch(day)
//         {
//             case "Saturday", "Sunday" -> "6am";

//             case "Monday" -> "8am";

//             default -> "7am";
//         };
//         System.out.print(result);
//     }
// }
// public class if_else {
//     public static void main(String[] args) {
//         String day = "Sunday";
//         String result;
//         result = switch (day) {
//             case "Saturday", "Sunday":
//                 yield "6am";

//             case "Monday":
//                 yield "8am";

//             default:
//                 yield "7am";
//         };
//         System.out.print(result);
//     }
// }


import java.util.Scanner;
public class if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum marks: ");
        int max = sc.nextInt();
        System.out.print("enter marks in first subject: ");
        int a = sc.nextInt();
        System.out.print("enter marks in second subject: ");
        int b = sc.nextInt();
        System.out.print("enter marks in third subject: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        if ((a/max)*100 <= 33 || (b/max)*100 <= 33 || (c/max)*100 <= 33){
            System.out.println("you failed!!");
        }
        else if ((sum/(3*max))*100 <= 40){
            System.out.println("you failed!!");
        }
        else{
            System.out.println("pass");
        }
        sc.close();
    }
}