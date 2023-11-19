// import java.util.Scanner;

// public class exercise {
//     public static void main(String[] args) {

//         // int i;
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter the number of integers to enter: ");
//         // int n = sc.nextInt();
//         // int[] arr = new int[n];
//         // for (i = 0; i < n; i++) {
//         //     System.out.println("Enter integer " + i);
//         //     arr[i] = sc.nextInt();
//         // }

//         // int even_sum = 0;
//         // int odd_sum = 0;
//         // for (i = 0; i < n; i++) {
//         //     if (arr[i] % 2 == 0) {
//         //         even_sum = even_sum + arr[i];
//         //     } else {
//         //         odd_sum = odd_sum + arr[i];
//         //     }
//         // }

//         // System.out.println("Sum of even integers is " + even_sum);
//         // System.out.println("Sum of odd integers is " + odd_sum);

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter an integer: ");
//         int number = scanner.nextInt();

//         int reversedNumber = reverseDigits(number);

//         System.out.println("Reversed number: " + reversedNumber);

//         scanner.close();
//     }

//     public static int reverseDigits(int num) {
//         int reversed = 0;
//         while (num != 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }
//         return reversed;
//     }
// }

// // import java.util.Scanner;

// // public class exercise {
// // public static void main(String[] args) {
// // Scanner scanner = new Scanner(System.in);

// // System.out.print("Enter an integer: ");
// // int number = scanner.nextInt();

// // int sum = calculateSumOfDigits(number);

// // System.out.println("Sum of digits: " + sum);

// // scanner.close();
// // }

// // public static int calculateSumOfDigits(int num) {
// // int sum = 0;
// // while (num != 0) {
// // sum += num % 10;
// // num /= 10; // Remove the last digit from the number
// // }
// // return sum;
// // }
// // }

// // import java.util.*;

// // public class exercise {
// // public static void main(String args[]) {
// // for (int i = 100; i < 1000; i++) {
// // int sum = 0;
// // int r = i;
// // for (int j = 0; j < 3; j++) {
// // sum += Math.pow(r % 10, 3);
// // r = r / 10;
// // }
// // if(sum == i){
// // System.out.print(i+" ");
// // }
// // }
// // }
// // }

// // import java.util.*;

// // public class exercise {
// // public static void main(String args[]) {
// // for (int i = 1; i < 1000; i++) {
// // int count = 0;
// // for (int j = 1; j < i; j++) {
// // if (i % j == 0) {
// // count++;
// // }
// // }
// // if (count == 1) {
// // System.out.print(i + " ");
// // }
// // }
// // }
// // }
// // import java.util.*;
// // public class exercise {
// // public static void main(String args[]) {
// // int i, j, row = 6;
// // for (i = 0; i < row; i++) {
// // // inner loop work for space
// // for (j = row - i - 2; j >= 0; j--) {

// // System.out.print(" ");
// // }
// // for (j = 0; j <= i; j++) {

// // System.out.print("*");
// // }
// // System.out.println();
// // }
// // }
// // }

// import java.util.*;

// class StringOperations {
//     boolean b = false;

//     public boolean hasAllAlphabets(String str) {
//         for (char c : str.toLowerCase().toCharArray()) {
//             if (Character.isLetter(c)) {
//                 b = true;
//             } else {
//                 b = false;
//                 break;
//             }
//         }
//         return b;
//     }

//     static void countVowels(String str) {
//         int count = 0;
//         for (char c : str.toLowerCase().toCharArray()) {
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                 count++;
//             }
//         }
//         if (count > 1) {
//             System.out.println("enterd string has more than one variable.\n");
//         } else {
//             System.out.println("enterd string has one variable.\n");

//         }
//     }

//     public void hasPluralForm(String str) {
//         if (str.endsWith("ies") || str.endsWith("s") || str.endsWith("es")) {
//             System.out.println("entered word is pural.\n");
//         } else {
//             System.out.println("entered word is not pural.\n");
//         }
//     }
// }

// public class exercise {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of strings: ");
//         int n = scanner.nextInt();

//         StringOperations[] so = new StringOperations[n];
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter string " + (i + 1) + ": ");
//             String input = scanner.next();
//             so[i] = new StringOperations();

//             boolean bb = so[i].hasAllAlphabets(input);
//             System.out.println(bb);

//             so[i].hasPluralForm(input);
//             so[i].countVowels(input);
//         }
//         scanner.close();
//     }
// }
