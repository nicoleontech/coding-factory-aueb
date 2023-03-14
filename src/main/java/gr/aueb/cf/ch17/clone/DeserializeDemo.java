package gr.aueb.cf.ch17.clone;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("C:\\Users\\NS\\trainee.ser")
        )) {

            Trainee alice;
            alice = (Trainee) inputStream.readObject();
            System.out.println(alice);
            System.out.println("Success in deserialization");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException | ClassNotFoundException e1) {
            System.out.println("Class not found exception " + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException " + e2);
            e2.printStackTrace();
        }
    }
}
