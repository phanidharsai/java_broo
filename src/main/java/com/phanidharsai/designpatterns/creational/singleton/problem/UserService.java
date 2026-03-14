package com.phanidharsai.designpatterns.creational.singleton.problem;

public class UserService {
    public void login(String username) {
        Logger logger = new Logger();  // Another new instance created
        logger.log("User " + username + " logged in.");
    }
}