package org.ergemp.HTTPExamples.function;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.apache.commons.text.StringEscapeUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class HttpHandler01 implements HttpHandler {

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {

            // String text = new String(httpExchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            // System.out.println(text);

            String requestParamValue=null;

            if ("GET".equals(httpExchange.getRequestMethod())) {
                //requestParamValue = handleGetRequest(httpExchange);
            } else if ("POST".equals(httpExchange)) {
                //requestParamValue = handlePostRequest(httpExchange);
            }

            requestParamValue= httpExchange.
                    getRequestURI()
                    .toString();

            handleResponse(httpExchange, requestParamValue);
        }

        private String handleGetRequest(HttpExchange httpExchange) {
            return httpExchange.
            getRequestURI()
                    .toString()
                    .split("\\?")[1]
                    .split("=")[1];
        }

        private String handlePostRequest(HttpExchange httpExchange) {
            return httpExchange.
                    getRequestURI()
                    .toString()
                    .split("\\?")[1]
                    .split("=")[1];
        }

        private void handleResponse(HttpExchange httpExchange, String requestParamValue)  throws IOException {

            OutputStream outputStream = httpExchange.getResponseBody();
            StringBuilder htmlBuilder = new StringBuilder();

            htmlBuilder.append("<html>").
            append("<body>").
            append("<h1>").
            append("Hello ")
                    .append(requestParamValue)
                    .append("</h1>")
                    .append("</body>")
                    .append("</html>");

            // encode HTML content
            String htmlResponse = StringEscapeUtils.escapeHtml4(htmlBuilder.toString());

            System.out.println(htmlBuilder);

            // this line is a must
            httpExchange.sendResponseHeaders(200, htmlBuilder.length());
            outputStream.write(htmlBuilder.toString().getBytes());
            outputStream.flush();
            outputStream.close();

        }
    }
