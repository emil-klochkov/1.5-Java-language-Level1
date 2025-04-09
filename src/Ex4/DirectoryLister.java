package Ex4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    public class DirectoryLister {
        public static void listDirectoryContents(String directoryPath, String indent, FileWriter writer) throws IOException {
            File directory = new File(directoryPath);

            if (!directory.exists() || !directory.isDirectory()) {
                writer.write("Error: The provided path is not a valid directory.\n");
                return;
            }

            File[] files = directory.listFiles();
            if (files == null) {
                writer.write("Error: Unable to list contents of the directory.\n");
                return;
            }

            for (File file : files) {
                writer.write(indent + (file.isDirectory() ? "[D] " : "[F] ") + file.getName() + "\n");

                if (file.isDirectory()) {
                    listDirectoryContents(file.getAbsolutePath(), indent + "  ", writer);
                }
            }
        }
    }
