import java.util.*;

public class getLestandmostfreqchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        // String s = str.substring(1,4);

        int[] arr = new int[str.length()];
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    arr[j] = -1;
                }
            }
            if (arr[i] != -1) {
                arr[i] = count;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.print("Least frequency element: ");
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == 0) {
                System.out.print(str.charAt(i) + " ");
            }
        }
        System.out.print("\nMost frequency element: ");
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == max) {
                System.out.print(str.charAt(i) + " ");
            }
            sc.close();
        }
    }
}

// int[] charCount = new int[256]; // Assuming ASCII characters

// for (int i = 0; i < str.length(); i++) {
// charCount[str.charAt(i)]++;
// }

// int minCount = Integer.MAX_VALUE;
// int maxCount = Integer.MIN_VALUE;
// char cmin = ' ';
// char cmax = ' ';

// for (int i = 0; i < 256; i++) {
// if (charCount[i] > 0) {
// if (charCount[i] > maxCount) {
// maxCount = charCount[i];
// cmax = (char) i;
// }
// if (charCount[i] < minCount) {
// minCount = charCount[i];
// cmin = (char) i;
// }
// }
// }
