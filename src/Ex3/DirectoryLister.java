package Ex3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryLister {

    public static void listDirectoryContents(String directoryPath, String indent, FileWriter writer) throws IOException {
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            writer.write("Error: The provided path is not a valid directory.\n");
            return;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

            for (File file : files) {
                String type = file.isDirectory() ? "(D)" : "(F)";
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));

                writer.write(indent + type + " " + file.getName() + " - Last Modified: " + lastModified + "\n");

                if (file.isDirectory()) {
                    listDirectoryContents(file.getAbsolutePath(), indent + "  ", writer);
                }
            }
        } else {
            writer.write(indent + "Error: Could not list the contents of the directory.\n");
        }
    }
}