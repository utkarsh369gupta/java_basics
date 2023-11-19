import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferfileIO {
    public static void main(String[] args) {
        String[] names = { "john", "samarth", "jackson" };
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            writer.write("hello, Utkarsh boss.");
            writer.write("\nhow can i help you sir.");
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            // System.out.println(reader.readLine());
            // reader.close();

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
