package com.nhnacademy.edu.springframework.messagesender;

public class User {

    final private String email;
    final private String phoneNumber;


    public User(String email, String phoneNumboer) {
        this.email = email;
        this.phoneNumber = phoneNumboer;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public String toString() {
        return getEmail()+" "+getPhoneNumber();
    }

}
