package org.ergemp.apacheHTTPRequestExamples;

import org.apache.http.*;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.message.BasicHttpResponse;

public class ApacheHTTPResponseHeaders {
    public static void main(String[] args) {

        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        response.addHeader("Set-Cookie",
                "c1=a; path=/; domain=localhost");
        response.addHeader("Set-Cookie",
                "c2=b; path=\"/\", c3=c; domain=\"localhost\"");
        Header h1 = response.getFirstHeader("Set-Cookie");
        System.out.println(h1);
        Header h2 = response.getLastHeader("Set-Cookie");
        System.out.println(h2);
        Header[] hs = response.getHeaders("Set-Cookie");
        System.out.println(hs.length);

        //
        //The most efficient way to obtain all headers of a given type is by using the HeaderIterator interface.
        //

        HeaderIterator it = response.headerIterator("Set-Cookie");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //
        //It also provides convenience methods to parse HTTP messages into individual header elements.
        //

        HeaderElementIterator it2 = new BasicHeaderElementIterator(
                response.headerIterator("Set-Cookie"));

        while (it2.hasNext()) {
            HeaderElement elem = it2.nextElement();
            System.out.println(elem.getName() + " = " + elem.getValue());
            NameValuePair[] params = elem.getParameters();
            for (int i = 0; i < params.length; i++) {
                System.out.println(" " + params[i]);
            }
        }


    }
}
