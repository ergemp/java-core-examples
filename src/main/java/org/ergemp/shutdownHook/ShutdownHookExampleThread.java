package org.ergemp.shutdownHook;

public class ShutdownHookExampleThread extends Thread {

    @Override
    public void run(){
        System.out.println("Shutdownhook1 ");
    }
}