package Ex4;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("  To list a directory: java Ex4.Main list <directory_path> <output_file.txt>");
            System.out.println("  To read a file: java Ex4.Main read <file_path>");
            return;
        }

        String command = args[0];

        if (command.equalsIgnoreCase("list") && args.length == 3) {
            String directoryPath = args[1];
            String outputFilePath = args[2];

            try (FileWriter writer = new FileWriter(outputFilePath)) {
                DirectoryLister.listDirectoryContents(directoryPath, "", writer);
                System.out.println("Directory contents saved to: " + outputFilePath);
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }

        } else if (command.equalsIgnoreCase("read") && args.length == 2) {
            String filePath = args[1];
            TextFileReader.readFileAndPrint(filePath);
        } else {
            System.out.println("Invalid command. Please use 'list' or 'read'.");
        }
    }
}
