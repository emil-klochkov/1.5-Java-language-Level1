package Ex5;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("  To serialize: java Main serialize <file.ser>");
            System.out.println("  To deserialize: java Main deserialize <file.ser>");
            return;
        }

        String command = args[0];
        String filePath = args[1];

        if (command.equalsIgnoreCase("serialize")) {
            Person person = new Person("Alice", 30);
            ObjectSerializer.serializeObject(person, filePath);

        } else if (command.equalsIgnoreCase("deserialize")) {
            Object obj = ObjectDeserializer.deserializeObject(filePath);
            if (obj instanceof Person) {
                System.out.println("Deserialized object: " + obj);
            } else {
                System.out.println("Error: The deserialized object is not of type Person.");
            }

        } else {
            System.out.println("Invalid command. Use 'serialize' or 'deserialize'.");
        }
    }
}