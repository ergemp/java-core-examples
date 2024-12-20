package org.ergemp.HTTPExamples;

import com.sun.net.httpserver.HttpServer;
import org.apache.log4j.Logger;
import org.ergemp.HTTPExamples.function.HttpHandler01;
import org.ergemp.apacheCommons.commonsLog4j.Log4jExample;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Example01 {
    public static void main(String[] args) {

        try {

            Logger logger = Logger.getLogger(Example01.class);

            // backlog value is 0, which means that we do not queue any requests.
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);

            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

            server.createContext("/test", new HttpHandler01());
            server.setExecutor(threadPoolExecutor);
            server.start();
            System.out.println(" Server started on port 8001");
            // logger.info(" Server started on port 8001");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
