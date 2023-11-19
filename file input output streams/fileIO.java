// import java.io.FileInputStream;

// public class fileIO {
//     public static void main(String args[]) {
//         try {
//             FileInputStream fin = new FileInputStream("output.txt");
//             int i = 0;
//             while ((i = fin.read()) != -1) {
//                 System.out.print((char) i);
//             }
//             fin.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

// import java.io.FileOutputStream;

// public class fileIO {
//     public static void main(String args[]) {
//         try {
//             FileOutputStream fout = new FileOutputStream("testout.txt");
//             String s = "Rohit Sharma is a batsman\nHardik is a bowler";
//             byte b[] = s.getBytes();
//             fout.write(b);
//             fout.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

import java.io.FileOutputStream;

public class fileIO {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("testout.txt", true);
            String s = "\nWelcome to SCOPE";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}