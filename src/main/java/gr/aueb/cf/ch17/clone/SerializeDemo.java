package gr.aueb.cf.ch17.clone;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) throws FileNotFoundException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\NS\\trainee.ser")
        )) {

            Trainee alice = new Trainee("Alice", new City("Athens"));
            outputStream.writeObject(alice);
            System.out.println("Success in serialization");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Serializable exception " + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException " + e2);
            e2.printStackTrace();
        }
    }
}
