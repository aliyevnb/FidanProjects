package org.example;

public class SingletonIntro {
        /* Singleton Design Pattern is a design pattern that makes sure that the class can have only one object.
    Rules:
        1) We must have Private constructor;
        2) We must have Private attribute of the class which refers to the single object;
        3) We should have at least one public method that allows us to create an instance (object) of the class.
        (Inside that public method, we will create a condition that limits us from creating more than one instance).
     */

    private static SingletonIntro mySingle; // private variable, no object yet

    private String info = "Initial class info";

    private SingletonIntro() {} // private constructor

    public static SingletonIntro createObj () {
        if (mySingle == null ){ // condition prohibiting creating second object
            mySingle = new SingletonIntro();
        }
        return mySingle;
    }

    public static SingletonIntro getMySingle() {
        return mySingle;
    }

    public static void setMySingle(SingletonIntro mySingle) {
        SingletonIntro.mySingle = mySingle;
    }

    /*
    * my getters and setters
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
