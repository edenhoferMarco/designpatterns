package de.marcoedenhofer.designpatterns.singleton;

/**
 * This Singleton is multithreading safe, it is JVM internally synchronized.
 */
public class JvmSynchronizedSingleton {
    private static JvmSynchronizedSingleton INSTANCE = new JvmSynchronizedSingleton();
    private int counter = 0;

    private JvmSynchronizedSingleton() {}

    public static JvmSynchronizedSingleton getInstance() {
        return INSTANCE;
    }

    public void count() {
        counter++;
    }

    public int getCounterValue() {
        return counter;
    }
}
