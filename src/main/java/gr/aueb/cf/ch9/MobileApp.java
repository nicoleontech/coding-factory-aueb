package gr.aueb.cf.ch9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class MobileApp {

    static final Path path = Paths.get("C:/tmp/log-mobile.txt");
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;

    public static void main(String[] args) {

    }

    //String... messages είναι από 0 έως περισσότερες παράμετροι varargs
    public static void log(Exception e, String... messages) {
        try (PrintStream printStream = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            printStream.println(LocalDateTime.now() + "\n" + e + "\n");
            printStream.printf("%s", (messages.length == 1) ? messages[0] : "");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static boolean insertContact(String firstname, String lastname, String phoneNumber) {
        return insertContact(firstname, lastname, phoneNumber);
    }

    private static String[] getContactByPhoneNumber(String phoneNumber) {
        return getContactByPhoneNumber(phoneNumber);
    }

    /**
     * Service Layer - services provided to the client
     */

    public static String[] getContactByPhoneNumberService(String phoneNumber) throws IllegalArgumentException {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Contact not found");
            } else {
                return contact;
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }



    public static void insertContactService(String firstname, String lastname, String phoneNumber) {
        try {
            if (!insertContact(firstname, lastname, phoneNumber)) {
                throw new IllegalArgumentException("Error in insert");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

//    public static void updateContactService(String oldPhoneNumber,String firstname, String lastname, String phoneNumber){
//        try{
//            if(!updateContact(oldPhoneNumber,firstname,lastname,phoneNumber)){
//                throw  new IllegalArgumentException("Update Error");
//            }
//        }
//        catch (IllegalArgumentException e) {
//            log(e);
//            throw e;
//        }
//    }


}
