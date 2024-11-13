package org.ergemp.threadExamples.threadPools;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedThreadPoolExample {
    public static void main(String[] args){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++)
        {
            Task task = new Task("Task " + i);
            System.out.println("Created : " + task.getName());

            executor.execute(task);
        }
        executor.shutdown();
    }
}

/*
*
* Another pre-configured ThreadPoolExecutor can be created with the Executors.newCachedThreadPool() method.
* This method does not receive a number of threads at all. The corePoolSize is actually set to 0, and the maximumPoolSize is set to Integer.MAX_VALUE for this instance.
* The keepAliveTime is 60 seconds for this one.
*
* */