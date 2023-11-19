// import java.util.*;
// public class practice_set{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String st1 = sc.nextLine();
//         String st2 = sc.nextLine();
//         System.out.println(st1.compareToIgnoreCase(st2));
//     }
// }

// import java.util.*;

// public class practice_set {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String input = sc.next();

//         char[] charArray = input.toCharArray();

//         Arrays.sort(charArray);

//         String sortedString = new String(charArray);

//         System.out.println(sortedString);
//     }
// }

// public class practice_set {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 110; i++) {
//             if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
//                 System.out.print("CozaLozaLoza ");
//                 continue;
//             }
//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.print("CozaLoza ");
//                 continue;
//             }
//             if (i % 5 == 0 && i % 7 == 0) {
//                 System.out.print("LozaWoza ");
//                 continue;
//             }
//             if (i % 3 == 0 && i % 7 == 0) {
//                 System.out.print("CozaWoza ");
//                 continue;
//             }
//             if (i % 3 == 0) {
//                 System.out.print("Coza ");
//                 continue;
//             }
//             if (i % 5 == 0) {
//                 System.out.print("Loza ");
//                 continue;
//             }
//             if (i % 7 == 0) { 
//                 System.out.print("Woza ");
//                 continue;
//             }
//             System.out.print(i+" ");
//         }
//     }
// }

// public class practice_set {
// public static void main(String[] args) {
// String[][] st = {
// { "a", "b", "c" },
// { "d", "e", "f" },
// { "g", "h", "i" }
// };
// String[][] newst = new String[3][3];
// for (int i = 0; i < st.length; i++) {
// for (int i = 0; i < st[0].length; i++) {
// newst[i][(i + 1) % (st[0].length)] = st[i][i];

// }
// }
// for (int i = 0; i < 3; i++) {
// for (int i = 0; i < 3; i++) {
// System.out.print(newst[i][i] + " ");
// }
// System.out.println();
// }
// }
// }

// import java.util.Scanner;

// public class practice_set {
//     public static void main(String[] args) {
//         double sum1 = 0, sum2 = 0;
//         for (int i = 1; i <= 50000; i++) {
//             sum1 += (1.0 / i);
//         }
//         for (int i = 50000; i >= 1; i--) {
//             sum2 += (1.0 / i);
//         }
//         System.out.println("sum from left to right: " + sum1);
//         System.out.println("sum from right to left: " + sum2);
//     }
// }

// import java.util.Arrays;

// public class practice_set {
// public static void main(String[] args) {
// String[] arr = {"hello", "hell", "hero","ab", "ze", "h"};
// Arrays.sort(arr);
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");

// }
// // System.out.println(longestCommonPrefix(arr));
// }
// static String longestCommonPrefix(String[] strs) {
// Arrays.sort(strs);
// String s1 = strs[0];
// String s2 = strs[strs.length-1];
// int idx = 0;
// while(idx < s1.length() && idx < s2.length()){
// if(s1.charAt(idx) == s2.charAt(idx)){
// idx++;
// } else {
// break;
// }
// }
// return s1.substring(0, idx);
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("enter the % of sweet given to son: ");
// double x = sc.nextDouble();
// System.out.print("enter the number of sweet given: ");
// double n = sc.nextDouble();
// double total = (n*100)/x;
// double g = (total-n);
// System.out.println("no. of sweets girl have: "+g);
// System.out.println("total no. of sweets: "+total);
// sc.close();
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("enter the radius of ground: ");
// double r = sc.nextDouble();
// System.out.print("enter the speed of the bike: ");
// double v = sc.nextDouble();

// double cir = 2 * 3.14 * r;
// double time = Math.ceil(cir / v);

// System.out.println(time);
// sc.close();
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("enter the number of packets buyed: ");
// int n = sc.nextInt();
// int netpacks = n + n / 5;
// System.out.println(netpacks);
// sc.close();
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("enter the withdraw amount: ");
// double n = sc.nextDouble();
// if (n % 100 == 0 && n <= 25000 && n > 0) {
// System.out.println("SUCCESS!!");
// } else {
// System.out.println("INVALID");
// }
// System.out.println();
// sc.close();
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("enter the Basic pay: ");
// double n = sc.nextDouble();

// System.out.println("enter the number of leaves taken: ");
// int leaves = sc.nextInt();

// double HRA = n * 0.3;
// double DA = n * 0.8;

// double grossSalary = n + HRA + DA;
// double netSalary = 0;
// int pf = 1800;
// if (leaves > 1) {
// double loss = (leaves - 1) * (n / 30);
// netSalary = grossSalary - pf - loss;
// } else {
// netSalary = grossSalary - pf;
// }
// System.out.println("Gross Salary: " + grossSalary + "\n Net Salary: " +
// netSalary);
// sc.close();
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("enter the number: ");
// int n = sc.nextInt();
// System.out.println(submation(n));
// }

// static int submation(int n) {
// if (n == 0) {
// return 0;
// } else {

// return n + submation(n - 1);
// }
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("enter the number: ");
// int n = sc.nextInt();
// System.out.println(submation(n));
// }

// static int submation(int n) {
// if (n == 0) {
// return 0;
// } else {

// return n + submation(n - 1);
// }
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("enter the number whose table you want: ");
// int n = sc.nextInt();
// for (int i = 1; i < 11; i++) {
// System.out.println(n + " * " + i + " = " + n*i);
// }
// }
// }

// import java.util.Scanner;

// public class practice_set {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// float[] arr = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f };
// float a = sc.nextFloat();
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == a) {
// System.out.println("element is present in an array.");
// }
// }

// System.out.println("element is not present");

// }
// }

// public class practice_set {
// public static void main(String[] args) {
// float sum = 0;
// float[] arr = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];
// }
// System.out.println(sum);
// }
// }

// class Solution {
// public int[] plusOne(int[] digits) {

// int n = digits.length-1;

// if(digits[0] == 9){
// int[] arr = new int[digits.length+1];
// for(int i = digits.length; i>0; i--){
// arr[i] = digits[i-1];
// }
// for(int i = n+1; i>=0; i--){
// if(arr[i] == 9){
// arr[i] = 0;
// arr[i-1] ++;
// break;
// }
// else{
// arr[i] ++;
// break;
// }
// }
// return arr;
// }
// else{
// for(int i = n; i>=0; i--){
// if(digits[i] == 9){
// digits[i] = 0;
// digits[i-1] ++;
// continue;
// }
// else{
// digits[i] ++;
// break;
// }
// }
// }
// return digits;
// }
// }

// import java.util.*;

// class practice_set {
// public static void main(String[] args) {
// int[] nums1 = { 1, 2, 3, 0, 0, 0 };
// int[] nums2 = { 2, 3 };
// int m = nums1.length;
// int n = nums2.length;
// System.arraycopy(nums2, 0, nums1, m, n);
// System.out.println(nums1);

// }

// public void merge(int[] nums1, int m, int[] nums2, int n) {
// System.arraycopy(nums2, 0, nums1, m, n);
// Arrays.sort(nums1);
// }
// }

// import java.util.*;
// import java.lang.*;
// class Solution {
// public int maxProfit(int[] a) {
// int mx=Integer.MIN_VALUE;int cp=0;
// int b=a[0],s=0;
// for(int i=0;i<a.length;i++){
// b=Math.min(b,a[i]);
// cp=a[i]-b;
// mx=Math.max(mx,cp);
// }
// return mx;
// }
// }

// import java.util.Scanner;

// public class practice_set {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter the number of rows: ");
// int rows = scanner.nextInt();

// System.out.println("Enter the number of columns: ");
// int columns = scanner.nextInt();

// int[][] array = new int[rows][columns];

// System.out.println("Enter the elements of the array: ");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < columns; j++) {
// array[i][j] = scanner.nextInt();
// }
// }
// int[] rowSums = new int[rows];
// for (int i = 0; i < rows; i++) {
// rowSums[i] = 0;
// for (int j = 0; j < columns; j++) {
// rowSums[i] += array[i][j];
// }
// }
// int[] columnSums = new int[columns];
// for (int j = 0; j < columns; j++) {
// columnSums[j] = 0;
// for (int i = 0; i < rows; i++) {
// columnSums[j] += array[i][j];
// }
// }
// int diagonalSum = 0;
// for (int i = 0; i < rows; i++) {
// diagonalSum += array[i][i];
// }
// System.out.println("The row sums are: ");
// for (int i = 0; i < rows; i++) {
// System.out.println(rowSums[i]);
// }
// System.out.println("The column sums are: ");
// for (int j = 0; j < columns; j++) {
// System.out.println(columnSums[j]);
// }
// System.out.println("The diagonal sum is: " + diagonalSum);
// }
// }

// import java.util.*;

// public class practice_set {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter shift: ");
//         int shift = sc.nextInt();
//         System.out.println("enter string you want to encode: ");
//         String str = sc.next();
//         char[] chars = str.toCharArray();
//         for (char i : chars) {
//             System.out.print((char) (i+shift));
//         }
//     }
// }

// public class practice_set {
//     public static void main(String[] args) {

//         String st = "hello i am boss";
//         String[] arr = st.split(" ");
//         for (String i : arr) {
//             System.out.println(i);
//         }
//     }
// }

// import java.util.*;
// public class practice_set {
//     public static void main(String[] args) {
//         int num = 7;
//         Integer a = new Integer(8);
//         System.out.print(a);
//     }
// }

// import java.util.Scanner;

// class WrongMarkException extends Exception {
//     public WrongMarkException(String message) {
//         super(message);
//     }
// }

// public class practice_set{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] marks = new int[20];

//         for (int i = 0; i < 20; i++) {
//             try {
//                 System.out.print("Enter a mark: ");
//                 int mark = scanner.nextInt();
//                 if (mark < 0 || mark > 100) {
//                     throw new WrongMarkException("Mark should be between 0 and 100");
//                 }
//                 marks[i] = mark;
//             } catch (WrongMarkException e) {
//                 System.out.println("Error: " + e.getMessage());
//                 i--; // Decrement i to re-enter the mark
//             } catch (java.util.InputMismatchException e) {
//                 System.out.println("Invalid input. Please enter a valid integer.");
//                 scanner.next(); // Clear the invalid input
//                 i--; // Decrement i to re-enter the mark
//             }
//         }

//         System.out.println("Entered marks: ");
//         for (int mark : marks) {
//             System.out.println(mark);
//         }
//     }
// }

import java.util.Scanner;

class MatrixCompatibilityException extends Exception {
    public MatrixCompatibilityException(String message) {
        super(message);
    }
}

public class practice_set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input matrix dimensions
            System.out.print("Enter the number of rows in M1: ");
            int rowsM1 = scanner.nextInt();
            System.out.print("Enter the number of columns in M1: ");
            int colsM1 = scanner.nextInt();

            System.out.print("Enter the number of rows in M2: ");
            int rowsM2 = scanner.nextInt();
            System.out.print("Enter the number of columns in M2: ");
            int colsM2 = scanner.nextInt();
            scanner.close();
            
            // Check compatibility for addition
            if (rowsM1 != rowsM2 || colsM1 != colsM2) {
                throw new MatrixCompatibilityException("Matrices are not compatible for addition.");
            }

            // Input matrix elements
            int[][] M1 = inputMatrix("M1", rowsM1, colsM1);
            int[][] M2 = inputMatrix("M2", rowsM2, colsM2);

            // Compute the sum of matrices
            int[][] sumMatrix = addMatrices(M1, M2);

            // Display the sum matrix
            System.out.println("Sum of the matrices:");
            printMatrix(sumMatrix);
        } catch (MatrixCompatibilityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }

    }

    public static int[][] inputMatrix(String name, int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(name + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return matrix;
    }

    public static int[][] addMatrices(int[][] M1, int[][] M2) {
        int rows = M1.length;
        int cols = M1[0].length;
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = M1[i][j] + M2[i][j];
            }
        }
        return sumMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
