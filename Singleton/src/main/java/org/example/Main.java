package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SingletonIntro singletonIntro = SingletonIntro.createObj();
        singletonIntro.setInfo("First instance");

        SingletonIntro singletonIntro1 = SingletonIntro.createObj();
        singletonIntro1.setInfo("Second instance");


        System.out.println(singletonIntro.getInfo());

        System.out.println(singletonIntro1.getInfo());

    }
}