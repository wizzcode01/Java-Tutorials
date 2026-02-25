package File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // How to write a file using java (4 popular option)

        // FileWriter = good for small medium size text
        // BufferedWriter = better performance for large amounts of text
        // PrintWriter = best for structured data, like reports or logs
        // FileOutputStream = best for binary files
        // String filePath = "C:\\Users\\HomePC\\Desktop\\test.txt";
        // String textContent = """
        // Roses are Red
        // Violets are Blue
        // Booty booty booty
        // ROCKIN` EVERYWHERE
        // """;
        String WriteFilePath = "C:\\Users\\HomePC\\Desktop\\test.txt";
        String textContent = """
                Roses are red'
                Violet are blue
                booty booty booty
                rocking everywhere
                """;

        try (FileWriter writer = new FileWriter(WriteFilePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }

        // READ FROM A FILE
        String filePath = "C:\\Users\\HomePC\\Desktop\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // System.out.println("That file exists");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
