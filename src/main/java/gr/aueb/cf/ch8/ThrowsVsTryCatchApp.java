package gr.aueb.cf.ch8;

import java.io.IOException;

public class ThrowsVsTryCatchApp {

    public static void main(String[] args) {
        //εφόσον η μέθοδος throws Exception, πρέπει και ο caller να κάνει handle το exception
        try{
            int ch = getChar();
        } catch (IOException e){
            System.out.println("IO Error");
        }


    }

    public static int getChar() throws IOException{
        try {
            return System.in.read();
        } catch (IOException e) {
            e.printStackTrace();   //log
                                  //recover state, here no because no transaction
            throw e;            // rethrow
        }
    }
}
