package org.addressbook;

import java.util.List;

public interface addressBook {
    void addContact();

    void editContact(String firstName);

    void deleteContact(String firstname);

    void daiplayAll();
    List<Contacts> retrunContactList();
}
