package org.ergemp.jettyExamples.authenticationExample;

import org.eclipse.jetty.security.*;
import org.eclipse.jetty.security.authentication.BasicAuthenticator;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Credential;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

//https://stackoverflow.com/questions/8056851/basic-authentication-with-embedded-jetty-7-server-and-no-web-xml-file
public class AuthenticationExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().print("Hello from Java!\n");
    }

    public static void main(String[] args) throws Exception {
        int port = 5000;
        try {
            port = Integer.valueOf(System.getenv("PORT"));
        } catch(NumberFormatException e) {}

        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setSecurityHandler(basicAuth("scott", "tiger", "Private!"));
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new AuthenticationExample()),"/");
        server.start();
        server.join();
    }

    private static final SecurityHandler basicAuth(String username, String password, String realm) {
        HashLoginService l = new HashLoginService();

        UserStore userStore = new UserStore();
        userStore.addUser(username, Credential.getCredential(password), new String[] { "users"});
        l.setUserStore(userStore);
        l.setName(realm);

        //l.putUser(username, Credential.getCredential(password), new String[] {"user"});
        //l.setName(realm);

        Constraint constraint = new Constraint();
        constraint.setName(Constraint.__BASIC_AUTH);
        constraint.setRoles(new String[]{"users"});
        constraint.setAuthenticate(true);

        ConstraintMapping cm = new ConstraintMapping();
        cm.setConstraint(constraint);
        cm.setPathSpec("/*");

        ConstraintSecurityHandler csh = new ConstraintSecurityHandler();
        csh.setConstraintMappings(Collections.singletonList(cm));
        csh.setAuthenticator(new BasicAuthenticator());
        //csh.setRealmName("myrealm");
        csh.setRealmName(realm);
        csh.addConstraintMapping(cm);
        csh.setLoginService(l);

        return csh;
    }
}
