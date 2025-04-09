package Ex2;

    public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <directory_path>");
            return;
        }

        DirectoryLister.listDirectoryContents(args[0], "");
    }
}

