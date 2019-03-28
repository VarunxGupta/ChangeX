package com.example.varun.changex;

public class User {
    public String name;
    public String email;
    public String password;
    public String phone;
    public String dob;

    public User(){}

    public User (String email,String password, String phone, String name, String dob){
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.name = name;
        this.dob = dob;
    }
}
