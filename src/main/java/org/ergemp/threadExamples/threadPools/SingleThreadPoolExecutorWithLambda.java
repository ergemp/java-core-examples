package org.ergemp.threadExamples.threadPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExecutorWithLambda {
    public static void main(String[] args){
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Hello World"));
        ((ExecutorService) executor).shutdown();
    }
}
