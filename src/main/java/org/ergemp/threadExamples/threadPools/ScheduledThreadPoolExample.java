package org.ergemp.threadExamples.threadPools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args){
        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);

        Task task = new Task("Repeat Task");
        System.out.println("Created : " + task.getName());

        executor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
    }
}

/*
*
*
*
ScheduledThreadPoolExecutor provides 4 methods which provide different capabilities to execute the tasks in repeated manner.

ScheduledFuture schedule(Runnable command, long delay, TimeUnit unit)                                       – Creates and executes a task that becomes enabled after the given delay.
ScheduledFuture schedule(Callable callable, long delay, TimeUnit unit)                                      – Creates and executes a ScheduledFuture that becomes enabled after the given delay.
ScheduledFuture scheduleAtFixedRate(Runnable command, long initialDelay, long delay, TimeUnit unit)         – Creates and executes a periodic action that becomes enabled first after the given initial delay, and subsequently with the given delay period. If any execution of this task takes longer than its period, then subsequent executions may start late, but will not concurrently execute.
ScheduledFuture scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)      – Creates and executes a periodic action that becomes enabled first after the given initial delay, and subsequently with the given delay period. No matter how much time a long running task takes, there will be a fixed delay time gap between two executions.
* */

/*
* schedule method allows to execute a task once after a specified delay;
*
scheduleAtFixedRate     method allows to execute a task after a specified initial delay and then execute it repeatedly with a certain period;
                        the period argument is the time measured between the starting times of the tasks, so the execution rate is fixed;
scheduleWithFixedDelay  method is similar to scheduleAtFixedRate in that it repeatedly executes the given task,
                        but the specified delay is measured between the end of the previous task and the start of the next;
                        the execution rate may vary depending on the time it takes to execute any given task.


The Executors.newScheduledThreadPool() method is typically used to create a ScheduledThreadPoolExecutor with a given corePoolSize, unbounded maximumPoolSize and zero keepAliveTime. Here's how to schedule a task for execution in 500 milliseconds:

* */