package Ex3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main <directory_path> <output_file.txt>");
            return;
        }

        String directoryPath = args[0];
        String outputFilePath = args[1];

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            DirectoryLister.listDirectoryContents(directoryPath, "", writer);
            System.out.println("Directory contents saved to: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}