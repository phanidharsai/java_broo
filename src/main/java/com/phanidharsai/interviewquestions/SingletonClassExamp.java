package com.phanidharsai.interviewquestions;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonClassExamp implements Serializable, Cloneable{

    private static final long serialVersionUID = 1L;

    private static SingletonClassExamp instance = null;

    private static Object DUMMY_OBJECT = new Object();

    private SingletonClassExamp(){
        /*To prevent object creation using reflection*/
        if(instance!=null){
            throw new InstantiationError( "Singleton Object is already created." );
        }
    }

    public static SingletonClassExamp getInstance(){
        /* Double checked locking*/
        if(instance == null){
            synchronized (DUMMY_OBJECT) {
                if(instance == null){
                    instance = new SingletonClassExamp();
                }
            }
        }
        return instance;
    }

    public static void print(){
        System.out.println("I am a singleton class.");
    }

    /*To prevent object creation using deserialization*/
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    /*To prevent object creation using cloning*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
