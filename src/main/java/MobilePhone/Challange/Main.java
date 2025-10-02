package MobilePhone.Challange;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("0662713860");
        mobilePhone.addNewContact(new Contact("Bob","31415926"));
        mobilePhone.addNewContact(new Contact("Alice","16180339"));
        mobilePhone.addNewContact(new Contact("Tom","11235813"));
        mobilePhone.addNewContact(new Contact("Jane","23571113"));
        mobilePhone.addNewContact(new Contact("Bob","31415926"));

        mobilePhone.printContacts();
    }
}
