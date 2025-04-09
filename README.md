# 1.5-Java-language-Level1

## Ex1 (Basic Directory Listing)
Lists the contents of a directory.

DirectoryLister.listDirectoryContents(String path): Lists file names in alphabetical order.

Main.java: Takes a directory path as an argument and calls the lister.

## Ex2 (Recursive Listing with Details)
Recursively lists a directory with file type and last modified date.

(D) for directories, (F) for files.

Indentation shows folder structure.

Uses SimpleDateFormat to show last modified timestamps.

## Ex3 (Directory Listing to File)
Same as Ex2, but saves output to a text file.

Uses FileWriter to write directory tree with timestamps.

Run with: java Main <directory_path> <output_file.txt>

## Ex4 (List or Read Files)
Adds a second option to read and print a file.

list <directory> <output.txt>: Saves folder structure to a file.

read <file>: Reads and prints file contents.

TextFileReader: Handles reading.

DirectoryLister: Writes structured output to file.

## Ex5 (Serialization and Deserialization)
Shows how to serialize and deserialize a Person object.

serialize <file.ser>: Saves a sample Person to file.

deserialize <file.ser>: Loads and prints the Person object.

Person: Serializable class with name, age, and toString().

ObjectSerializer and ObjectDeserializer: Manage saving/loading objects.
