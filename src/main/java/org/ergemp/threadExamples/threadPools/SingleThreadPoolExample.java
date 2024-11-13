package org.ergemp.threadExamples.threadPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExample {
    public static void main(String[] args){

        Executor executor =  Executors.newSingleThreadExecutor();
        executor.execute(new Task("Hello world"));
        ((ExecutorService) executor).shutdown();
    }
}

/*
* The Executors.newSingleThreadExecutor() API creates another typical form of ThreadPoolExecutor containing a single thread.
* The single thread executor is ideal for creating an event loop. The corePoolSize and maximumPoolSize parameters are equal to 1, and the keepAliveTime is zero.
*
* Additionally, this ThreadPoolExecutor is decorated with an immutable wrapper, so it cannot be reconfigured after creation.
* Note that also this is the reason we cannot cast it to a ThreadPoolExecutor.
* */
