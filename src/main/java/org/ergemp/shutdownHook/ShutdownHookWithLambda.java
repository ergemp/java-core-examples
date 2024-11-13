package org.ergemp.shutdownHook;

public class ShutdownHookWithLambda {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting Down");
        }));
    }
}
