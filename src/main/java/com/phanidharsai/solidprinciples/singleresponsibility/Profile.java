package com.phanidharsai.solidprinciples.singleresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String userName;
    private String emailAddress;
    private String password;

    private List<Profile> friends= new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Profile> getFriends() {
        return friends;
    }

}