package HW11;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("ToCopy.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("Copied.txt"));

        String string;
        while ((string = input.readLine()) != null) {
            output.write(string + "\n");
        }

        input.close();
        output.close();
    }
}
