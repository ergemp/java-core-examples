package org.ergemp.HTTPRequestExamples;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

public class ApacheHTTPAuthentication {
    public static void main(String[] args) {

        UsernamePasswordCredentials creds = new UsernamePasswordCredentials("user", "pwd");
        System.out.println(creds.getUserPrincipal().getName());
        System.out.println(creds.getPassword());

        // Credentials provider
        // Credentials providers are intended to maintain a set of user credentials and to be able to
        // produce user credentials for a particular authentication scope.
        // Authentication scope consists of a host name, a port number, a realm name and an authentication scheme name.
        //
        // When registering credentials with the credentials provider one can provide a wild card
        // (any host, any port, any realm, any scheme) instead of a concrete attribute value.
        // The credentials provider is then expected to be able to find the closest match for a particular scope
        // if the direct match cannot be found.
        //
        // HttpClient can work with any physical representation of a credentials provider that implements the
        // CredentialsProvider interface.
        // The default CredentialsProvider implementation called BasicCredentialsProvider
        // is a simple implementation backed by a java.util.HashMap.

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope("somehost", AuthScope.ANY_PORT),
                new UsernamePasswordCredentials("u1", "p1"));
        credsProvider.setCredentials(
                new AuthScope("somehost", 8080),
                new UsernamePasswordCredentials("u2", "p2"));
        credsProvider.setCredentials(
                new AuthScope("otherhost", 8080, AuthScope.ANY_REALM, "ntlm"),
                new UsernamePasswordCredentials("u3", "p3"));

        System.out.println(credsProvider.getCredentials(
                new AuthScope("somehost", 80, "realm", "basic")));
        System.out.println(credsProvider.getCredentials(
                new AuthScope("somehost", 8080, "realm", "basic")));
        System.out.println(credsProvider.getCredentials(
                new AuthScope("otherhost", 8080, "realm", "basic")));
        System.out.println(credsProvider.getCredentials(
                new AuthScope("otherhost", 8080, null, "ntlm")));

    }
}
