package com.phanidharsai.solidprinciples.openandclosed;

public class Application {
    public void addPhotos(){

    }
    public void addPost(){

    }
    public void sendMessage(){

    }
/** now lets say we need another functionality including the functions in this or need a different kind of
 *  implementation for a particular method the best way to achieve this is using a different class and extending
 *  the current class so that we can provide a different implementation for a method or add a different functionality
 *  like sending photos
* */

}
