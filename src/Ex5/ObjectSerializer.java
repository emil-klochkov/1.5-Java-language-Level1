package Ex5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializer {
    public static void serializeObject(Object obj, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(obj);
            System.out.println("Object serialized and saved to: " + filePath);
        } catch (IOException e) {
            System.out.println("Error serializing the object: " + e.getMessage());
        }
    }
}