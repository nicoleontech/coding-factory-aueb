package gr.aueb.cf.ch16.exceptions;

public class InsufficientAmountException extends Exception{
    private static final long serialVersionUID = 1L;

    public  InsufficientAmountException(double amount){
        super("Amount "+ amount + " is insufficient");
    }

}
