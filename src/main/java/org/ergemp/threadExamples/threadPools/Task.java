package org.ergemp.threadExamples.threadPools;

import java.util.Date;

public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);

            //System.out.println("Executing : " + name);
            System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
            //TimeUnit.SECONDS.sleep(duration);
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
