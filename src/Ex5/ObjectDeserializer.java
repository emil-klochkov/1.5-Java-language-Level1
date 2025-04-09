package Ex5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializer {
    public static Object deserializeObject(String filePath) {
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing the object: " + e.getMessage());
            return null;
        }
    }
}