package gr.aueb.cf.ch18.mobilecontacts.service;

import gr.aueb.cf.ch18.mobilecontacts.dto.MobileContactDTO;
import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.ContactNotFoundException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.PhoneNumberAlreadyExistsException;
import gr.aueb.cf.ch18.mobilecontacts.service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {

    MobileContact insertMobileContact(MobileContactDTO mobileContactDTO)
            throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    MobileContact updateMobileContact(MobileContactDTO mobileContactDTO)
            throws PhoneNumberAlreadyExistsException, ContactNotFoundException;

    void deleteMobileContact(String phoneNumber) throws ContactNotFoundException;

    MobileContact getContact(String phoneNumber) throws ContactNotFoundException;

    MobileContact getContact(Long id) throws ContactNotFoundException;

    List<MobileContact> getAllContacts();
}

