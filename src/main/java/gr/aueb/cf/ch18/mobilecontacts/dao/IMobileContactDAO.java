package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {

    MobileContact insert(MobileContact mobileContact);

    MobileContact update(MobileContact mobileContact);

    void delete(String phoneNumber);

    void delete(Long id);

    MobileContact get(Long id);

    MobileContact get(String phoneNumber);

    List<MobileContact> getAll();

    boolean phoneNumberExists(String phoneNumber);

    boolean userIdExists(Long id);

}
