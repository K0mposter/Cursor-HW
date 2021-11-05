package HW11;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("Cursor_HW11/src/HW11/ToCopy.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("Cursor_HW11/src/HW11/Copied.txt"));

        String string;
        while ((string = input.readLine()) != null) {
            output.write(string + "\n");
        }

        input.close();
        output.close();
    }
}
