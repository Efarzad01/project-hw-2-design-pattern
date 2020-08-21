package Vo_run;

import creational.singleton.design.pattern.Singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
