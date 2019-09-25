package M4_as1;

import javax.naming.Name;

/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
class Contact {
    String name;
    String email;
    String PN;
    public Contact(String Name, String Email, String phoneNumber) {
        name=Name;
        email=Email;
        PN=phoneNumber;
        //System.out.println(name+"     "+email+"     "+PN);
    }
    String getName(){
        //System.out.println(name+"Hello");
    return name;
}
String getEmail(){
    return email;
    }
    String getPhoneNumber(){
        return PN;
    }
    String setName(String Name){
        name=Name;
        return name;
    }
    String setEmail(String Email){
        email=Email;
        return email;
    }
    String setPhoneNumber(String PhoneNumber){
        PN=PhoneNumber;
        return PN;
    }

    @Override
    public String toString() {
        String s="{ Name = "+name+", Email = "+email+", Phone Number = "+PN+" }";
        return s;
    }
}