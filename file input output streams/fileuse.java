import java.io.*;

public class fileuse {
    public static void main(String[] args) {
        String path = "";
        boolean bool = false;
        try {
            // createing new files
            File file = new File("testFile1.txt");
            file.createNewFile();
            // returns true if the file exists
            bool = file.exists();
            // returns absolute pathname
            path = file.getAbsolutePath();
            System.out.print(path + " Exists? " + bool);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}