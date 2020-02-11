package de.marcoedenhofer.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SingletonClient {
    public static void main(String[] args) throws InterruptedException {
        final int NUMBER_OF_THREADS = 3;
        final int NUMBER_OF_COUNTS = 10;

        ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        List<Future<?>> futures = new ArrayList<>(NUMBER_OF_THREADS);
        JvmSynchronizedSingleton singleton = JvmSynchronizedSingleton.getInstance();

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            futures.add(executor.submit(new WorkerThread(JvmSynchronizedSingleton.getInstance(), NUMBER_OF_COUNTS)));
        }

        executor.shutdown();
        executor.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Expected Value: " + (NUMBER_OF_THREADS * NUMBER_OF_COUNTS)
                + "\tCounter Value: " + singleton.getCounterValue());

    }
}
