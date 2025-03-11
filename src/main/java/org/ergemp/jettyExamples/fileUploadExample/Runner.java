package org.ergemp.jettyExamples.fileUploadExample;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletHandler;

public class Runner {
    public static void main(String[] args) throws Exception {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));


        Server server = new Server(8080);

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setResourceBase("./src/main/java/org/ergemp/jettyExamples/fileUploadExample/www");
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setWelcomeFiles(new String[]{ "fileUpload.html" });

        ServletHandler handler = new ServletHandler();

        //set the handlers
        //basic handlers
        handler.addServletWithMapping(UploadServlet.class, "/rest/upload");

        resourceHandler.setHandler(handler);
        server.setHandler(resourceHandler);

        server.start();
        server.join();
    }
}
