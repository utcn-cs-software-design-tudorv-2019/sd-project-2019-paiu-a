package com.myexample.project.Model;

public class Admin {

    private String name, email, information, password;

    public Admin(){}

    public Admin(String name, String email, String information, String password){
        this.name = name;
        this.email = email;
        this.information = information;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
