package com.example.netflix.Models;

public class Users {
    private Long id;
    private  String identificationNumber;
    private String userName;

    public Users(Long id, String identificationNumber, String userName) {
        this.id = id;
        this.identificationNumber = identificationNumber;
        this.userName = userName;
    }

    public Users(String identificationNumber, String userName) {
        this.identificationNumber = identificationNumber;
        this.userName = userName;
    }

    public Users(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
