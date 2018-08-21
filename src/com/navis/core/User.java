package com.navis.core;  //optional, there must be either one or no package in a single .java file

//1. Data members or instance variables
    //2. Constructors
    //3. Methods - mutators and business methods (public or private - helpers)

public class User { //top level class can either public or default

    public String userName;
    public String mailId;

    public User(){      //default constructor in case we don't want to initialize with anythings

    }

    public User(String userName, String mailId) {       //parameterized constructor
        this.userName = userName;
        this.mailId = mailId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getMailId() {

        return mailId;
    }

    public void setMailId(String mailId) {

        this.mailId = mailId;
    }


    public boolean validateMail(){

        if(mailId.length() < 8 ) {
            return false;
        }
         else{
            return true;
         }
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", mailId='" + mailId + '\'' +
                '}';
    }
}
