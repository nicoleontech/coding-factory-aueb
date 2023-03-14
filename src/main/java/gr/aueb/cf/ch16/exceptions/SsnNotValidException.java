package gr.aueb.cf.ch16.exceptions;

public class SsnNotValidException extends Exception {
    private static final long seralVersionUID = 1L;

    public SsnNotValidException(String ssn) {
        super("SSN " + ssn + " is not valid");
    }
}
