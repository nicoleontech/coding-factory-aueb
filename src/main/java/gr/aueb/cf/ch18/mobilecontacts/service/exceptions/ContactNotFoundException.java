package gr.aueb.cf.ch18.mobilecontacts.service.exceptions;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

public class ContactNotFoundException extends Exception {

    private final static long serialVersionUID = 1L;

    public ContactNotFoundException(String phoneNumber) {
        super("Mobile contact with phoneNumber " + phoneNumber + " was not found");
    }

    public ContactNotFoundException(Long id) {
        super("Mobile contact with id " + id + " was not found");
    }

    public ContactNotFoundException(MobileContact mobileContact) {
        super("Mobile contact with id " + mobileContact.getId() +
                "with phone number " + mobileContact.getPhoneNumber() + " was not found");
    }

}
