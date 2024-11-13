package org.ergemp.shutdownHook;

public class ShutdownHookExampleMain {
    public static void main(String[] args) throws InterruptedException {
        Runtime.getRuntime().addShutdownHook(new ShutdownHookExampleThread());

        Thread.sleep(15000);

    }
}
