package com.phanidharsai.solidprinciples.singleresponsibility;

public class ProfileOps {

    public void createProfile(Profile profile){
        // method to create profile
    }
    public void updateProfile(Profile changedProfile){
        // method to update profile
    }
    public void deleteProfile(String userName){
        // method to delete profile
    }
/** Below method should not be included in this class is responsible only for profile related operations like
 * create, update, delete, view and a few more which are related to either modifying or getting profile details
 * since sending message is a different functionality it should be in a separate class like connectivityFeatures
* */
    public void sendMessage(String message){
        // method to send message to friend
    }
}
