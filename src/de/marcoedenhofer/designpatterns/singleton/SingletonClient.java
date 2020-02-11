package de.marcoedenhofer.designpatterns.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        JvmSynchronizedSingleton singleton1 = JvmSynchronizedSingleton.getInstance();
        singleton1.count();
        System.out.println(singleton1.getCounterValue());

        JvmSynchronizedSingleton singleton2 = JvmSynchronizedSingleton.getInstance();
        singleton2.count();
        System.out.println(singleton2.getCounterValue());

        singleton1.count();
        System.out.println(singleton2.getCounterValue());
    }
}
