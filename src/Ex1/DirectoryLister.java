package Ex1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Error: The provided path is not a valid directory.");
            return;
        }

        String[] files = directory.list();
        if (files != null) {
            Arrays.sort(files);
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Error: Could not list the contents of the directory.");
        }
    }
}