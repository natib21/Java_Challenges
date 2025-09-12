package ArrayList;

import java.util.ArrayList;

class Contact{
    private String name;
    private  String phoneNumber;

    public Contact(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getPhonenumber(){
        return phoneNumber;
    }
    public static Contact createContact(String name , String phoneNumber){
        return new Contact(name,phoneNumber);
    }

}
public class Main {

    public static void main(String[] args) {

        Contact nati = Contact.createContact("Nathnael Zelalem","0923479921");
        Contact zelalem = new Contact("Zelalem","0911413623");
        MobilePhone mobile = new MobilePhone("0923479921");
        mobile.addNewContact(nati);
        mobile.addNewContact(Contact.createContact("Mimo","0912010663"));
        mobile.addNewContact(zelalem);
        mobile.addNewContact(Contact.createContact("Picolo","0911111111"));
        mobile.printContacts();

        mobile.updateContact(nati,Contact.createContact("Leul Alula","0912211221"));
        mobile.printContacts();


        mobile.removeContact(zelalem);
        mobile.printContacts();




//        MobilePhone myPhone = new MobilePhone("123-456-7890");
//        System.out.println("Phone created with number: " + myPhone.queryContact("John"));
//
//        System.out.println("--- Testing addNewContact() ---");
//        // Add new contacts
//        Contact john = Contact.createContact("John", "987-654-3210");
//        myPhone.addNewContact(john); // Should return true
//        myPhone.addNewContact(Contact.createContact("Jane", "111-222-3333")); // Should return true
//        myPhone.addNewContact(Contact.createContact("John", "444-555-6666"));// Should return false (duplicate)
//
//
////
//        myPhone.printContacts();
////
//        System.out.println("--- Testing updateContact() ---");
////        // Update an existing contact
//        Contact oldJane = myPhone.queryContact("Jane");
//        Contact newJane = Contact.createContact("Jane", "999-888-7777");
//        myPhone.updateContact(oldJane, newJane); // Should return true
////
////        // Try to update a non-existent contact
//        myPhone.updateContact(Contact.createContact("Bob", "000-000-0000"), Contact.createContact("Robert", "000-000-0000")); // Should return false
////
//        myPhone.printContacts();
////
//        System.out.println("--- Testing removeContact() ---");
////        // Remove an existing contact
//        myPhone.removeContact(john); // Should return true
////
////        // Try to remove a non-existent contact
//        myPhone.removeContact(Contact.createContact("David", "123-456-7890")); // Should return false
////
//        myPhone.printContacts();
////
//        System.out.println("--- Testing queryContact() ---");
////        // Query for an existing contact
//        Contact queriedContact = myPhone.queryContact("Jane");
//        if (queriedContact != null) {
//            System.out.println("Found contact: " + queriedContact.getName() + " -> " + queriedContact.getPhonenumber());
//        } else {
//            System.out.println("Contact not found.");
//        }
////
//        // Query for a non-existent contact
//        queriedContact = myPhone.queryContact("John");
//        if (queriedContact != null) {
//            System.out.println("Found contact: " + queriedContact.getName() + " -> " + queriedContact.getPhonenumber());
//        } else {
//            System.out.println("Contact not found.");
//        }
    }
}

class MobilePhone{
    private String myNumber;
    private ArrayList<Contact> myContact = new ArrayList<>();

    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
          if(findContact(contact.getName()) >= 0){
              System.out.println("Contact with name " + contact.getName() + " already exists.");
              return false;
          }
          myContact.add(contact);
          return  true;
    }

    public boolean updateContact(Contact olderVal, Contact newVal){
       int foundPosition = findContact(olderVal);
        if(foundPosition < 0 ){
            System.out.println(olderVal.getName() +" was not found");
            return  false;
        }else if(findContact(newVal.getName()) != -1){
            System.out.println("Contact with name " + newVal.getName() +
                    " already exists.  Update was not successful.");
            return false;
        }
        myContact.set(foundPosition , newVal);
        System.out.println(olderVal.getName() + ", was replaced with " + newVal.getName());
        return true;

    }
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName()+" Was Not Found");
            return  false;
        }
        myContact.remove(foundPosition);
        System.out.println(contact.getName() +", was deleted");
        return true;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContact.get(position);
        }
        return null;
    }
    public int findContact(Contact contact){
        return myContact.indexOf(contact);
    }
    public int findContact(String name){
        for(int i =0 ; i< myContact.size(); i++){
            Contact contact = myContact.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContact.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContact.get(i).getName() + " -> " +
                    this.myContact.get(i).getPhonenumber());
        }
    }
}


