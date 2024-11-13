package org.ergemp.threadExamples;

public class ThreadsLambda {
    public static void main(String[] args)
    {
        // Using anonymous innerclass
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

        // Using lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

        // Using anonymous innerclass
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // Using lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

        // Run me!
        race1.run();
        race2.run();
    }
}
