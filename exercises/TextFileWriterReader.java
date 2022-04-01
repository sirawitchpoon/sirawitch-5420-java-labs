package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileWriterReader {
    public static void main(String[] args) {
        String id = "643040542-0";
        String name = "สิรวิชญ์ บุตรโยจันโท";
        try {
            String filename = args[0];
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);
            System.out.println("Writing " + id + " " + name + " to file " + filename);
            pw.println(id + " " + name);
            pw.close();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Provide filename in the program argument");
        } catch (IOException ex) {
            System.err.println("Error in reading file");
            ex.printStackTrace(System.err);
        }
        try {
            String filename = args[0];
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Reading " + line + " to file " + filename);
                System.out.println("The read data from the file is " + line);
            }
            br.close();
            fr.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Provide filename in the program argument");
        } catch (IOException ex) {
            System.err.println("Error in reading file");
            ex.printStackTrace(System.err);
        }
    }
}
