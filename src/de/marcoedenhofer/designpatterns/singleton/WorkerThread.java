package de.marcoedenhofer.designpatterns.singleton;

public class WorkerThread implements Runnable {
    private final int NUMBER_OF_COUNTS;
    private final JvmSynchronizedSingleton singleton;

    WorkerThread(JvmSynchronizedSingleton singleton, int numberOfCounts) {
        this.singleton = singleton;
        this.NUMBER_OF_COUNTS = numberOfCounts;
    }

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_OF_COUNTS; i++) {
            singleton.count();
        }
    }
}
