package com.guilherme.miguel.singleton;

/**
 * @author Miguel Guilherme
 */
public class Singleton {

    private static Singleton instance;

    private String message;

    // make the constructor private so that this class cannot be instantiated
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
