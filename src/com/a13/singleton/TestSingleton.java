package com.a13.singleton;

/**
 * test pour une classe différente
 * créer un Singleton
 * pour pratiquer le design pattern
 */
public class TestSingleton {
    private final int value=12;
    private static TestSingleton instance;
    private TestSingleton() {}

    public static TestSingleton getInstance() {
        if(instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

}
