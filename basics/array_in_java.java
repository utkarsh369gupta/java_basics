// import java.util.Scanner;

// public class array_in_java{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = new int [3][];
//         int[][] arr = new int[][]{new int[]{1,2,3,4}, new int[]{3,4,5}, new int[]{6,7}};
//         a[0]= new int[2];
//         a[1]= new int[4];
//         a[2]= new int[3];
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 System.out.print(a[i][j]+ " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


// // // inserting an element from an array
// import java.util.Scanner;

// public class array_in_java {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of an array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         int[] arr1 = new int[size + 1];
//         System.out.print("enter the element in an array: ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("enter the element you want to add: ");
//         int n = sc.nextInt();
//         System.out.print("enter the index where you want to add: ");
//         int index = sc.nextInt();
//         for (int i = 0; i < arr1.length; i++) {
//             if (i < index) {
//                 arr1[i] = arr[i];
//             } else if (i == index) {
//                 arr1[i] = n;
//             } else {
//                 arr1[i] = arr[i-1];
//             }
//         }
//         System.out.println("final array: ");
//         for (int i = 0; i < arr1.length; i++) {
//             System.out.print(arr1[i] + " ");
//         }
//     }
// }
// deleting an element from array
// import java.util.Scanner;

// public class array_in_java {
// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
// Scanner sc = new Scanner(System.in);
// System.out.print("enter the index of element you want to remove: ");
// int n = sc.nextInt();
// for (int i = n; i < arr.length-1; i++) {
// arr[i] = arr[i+1];
// }
// for (int i = 0; i < arr.length-1; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }
// rotation of array
// import java.util.Scanner;

// public class array_in_java {
// static void rotation(int[] arr) {
// int temp = arr[0];
// for (int i = 0; i < arr.length - 1; i++) {
// arr[i] = arr[i + 1];
// }
// arr[arr.length - 1] = temp;

// }
// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 0; i < n; i++) {
// rotation(arr);
// }
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// }
// checking array is sorted or not
// import java.util.*;
// public class array_in_java{
// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
// boolean isSorted = true;
// for (int i = 0; i < arr.length-1; i++) {
// if (arr[i] > arr[i + 1]) {
// isSorted = false;
// break;
// }
// }
// if (isSorted){
// System.out.println("array is sorted");
// }
// else{
// System.out.println("array is not sorted");
// }
// }

// }

// reversing an array
// import java.util.*;

// public class array_in_java {
// public static void main(String[] args) {
// // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
// // for (int i = 0; i < arr.length / 2; i++) {
// // int temp = arr[i];
// // arr[i] = arr[arr.length - i - 1];
// // arr[arr.length - i - 1] = temp;
// // }
// // for (int i = 0; i < arr.length; i++) {
// // System.out.print(arr[i] + " ");
// // }
// // int[] arr1 = {4,1,66,-3,2,99,69,0,-34};
// // int max = arr1[0];
// // int min = arr1[0];
// // for (int i = 0; i < arr1.length; i++) {
// // if (arr1[i] > max) {
// // max = arr1[i];
// // }
// // if (arr1[i] < min) {
// // min = arr1[i];
// // }
// // }
// // System.out.println(max);
// // System.out.println(min);

// }
// }
// import java.util.*;
// public class array_in_java {
// public static void main(String[] args) {
// int [] marks;
// int [][] flats;
// flats = new int [2][3];
// flats[0][0] = 101;
// flats[0][1] = 102;
// flats[0][2] = 103;
// flats[1][0] = 201;
// flats[1][1] = 202;
// flats[1][2] = 203;

// }
// }

// import java.util.*;
// public class array_in_java {
// public static void main(String[] args) {
// int[] marks = {98, 45, 79, 99, 80};
// // System.out.println(marks.length);

// for (int i : marks) {
// System.out.println(i);
// }
// String [] students = {"Harry", "Rohan", "samarth"};
// System.out.println(students.length);
// }
// }

// import java.util.*;

// public class array_in_java {
// public static void main(String[] args) {

// // int[] smallPrime = { 2, 3, 4, 5, 6, };
// // System.out.println(smallPrime[0]);

// int[] smallPrime = { 2, 3, 5, 7, 11, 13 };
// int[] luckynumber = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
// System.arraycopy(smallPrime, 2, luckynumber, 3, 4);
// for (int i = 0; i < luckynumber.length; i++) {
// System.out.println(i + " : " + luckynumber[i]);
// }
// }
// }

// import java.util.Scanner;

// public class array_in_java {
//     public static void main(String[] args) {
//         int[][] arr = new int[4][4];
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int temp = arr[0][0];
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) {
//                 if (j < 3) {
//                     arr[i][j] = arr[i][j + 1];
//                 } else if(i<3) {
//                     arr[i][j] = arr[i + 1][j];
//                 }
//             }
//         }
//         arr[3][3] = temp;
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println("\n");
//         }
//         sc.close();
//     }
// }

// public class array_in_java {
//     public static void main(String[] args) {
//         int[][] originalArray = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int numRows = originalArray.length;
//         int numCols = originalArray[0].length;

//         int[][] shiftedArray = new int[numRows][numCols];

//         // Shift elements one position to the right
//         for (int i = 0; i < numRows; i++) {
//             for (int j = 0; j < numCols; j++) {
//                 shiftedArray[i][(j + 1) % numRows] = originalArray[i][j];
//             }
//         }
 
//         // Print the shifted array
//         for (int i = 0; i < numRows; i++) {
//             for (int j = 0; j < numCols; j++) {
//                 System.out.print(shiftedArray[i][j] + " ");
//             }
//             System.out.println();
//         } 
//     }
// }

// public class array_in_java {
//     public static void main(String[] args) {
//         int[][] array = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int rows = array.length;
//         int cols = array[0].length;

//         // Create a new array to store the rotated elements
//         int[][] rotatedArray = new int[cols][rows];

//         // Rotate each element by 90 degrees clockwise
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 rotatedArray[j][rows - 1 - i] = array[i][j];
//             }
//         }

//         // Print the original and rotated arrays
//         System.out.println("Original Array:");
//         printArray(array);

//         System.out.println("\nRotated Array:");
//         printArray(rotatedArray);
//     }

//     // Helper method to print a 2D array
//     public static void printArray(int[][] arr) {
//         for (int[] row : arr) {
//             for (int element : row) {
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class array_in_java {
//     public static void main(String[] args) {
//         int[][] array = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int rows = array.length;
//         int cols = array[0].length;

//         // Create a new array to store the rotated elements
//         int[][] rotatedArray = new int[rows][cols];

//         // Rotate each element by moving one step to the left
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 int newCol = (j - 1 + cols) % cols; // Calculate the new column index after rotation
//                 rotatedArray[i][newCol] = array[i][j];
//             }
//         }

//         // Print the original and rotated arrays
//         System.out.println("Original Array:");
//         printArray(array);

//         System.out.println("\nRotated Array:");
//         printArray(rotatedArray);
//     }

//     // Helper method to print a 2D array
//     public static void printArray(int[][] arr) {
//         for (int[] row : arr) {
//             for (int element : row) {
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// class array_in_java {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         char arr[][] = {
//             { 'a', 'b', 'c' },
//             { 'd', 'e', 'f' },
//             { 'g', 'h', 'i' }
//     };
//         // char arr[][] = new char[n][n];
//         // for (int i = 0; i < n; i++) {
//         //     for (int j = 0; j < n; j++) {
//         //         arr[i][j] = sc.next().charAt(0);
//         //     }
//         // }
//         int rotation = sc.nextInt();

//         for (int k = 0; k < rotation; k++) {
//             char a = arr[0][0];
//             int row = 0, col = 0;
//             for (int i = 0; i < n * n - 1; i++) {
//                 if (col + 1 == n) {
//                     arr[row][col] = arr[row + 1][0];
//                     row++;
//                     col = 0;
//                     // System.out.println(row+" "+col);
//                 } else {
//                     arr[row][col] = arr[row][col + 1];
//                     col++;
//                     // System.out.println(row+" "+col);
//                 }
//             }
//             arr[n - 1][n - 1] = a;
//         }

//         // printing
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
