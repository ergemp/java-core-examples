package org.ergemp.threadExamples.threadPools;

import java.util.concurrent.*;

public class ScheduledThreadPoolExampleWithCountDownLatch {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch lock = new CountDownLatch(5);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
            lock.countDown();
        }, 500, 100, TimeUnit.MILLISECONDS);

        lock.await(1000, TimeUnit.MILLISECONDS);
        future.cancel(true);

        executor.shutdown();

    }
}
