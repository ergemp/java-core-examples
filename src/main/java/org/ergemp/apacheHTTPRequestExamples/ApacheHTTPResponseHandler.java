package org.ergemp.apacheHTTPRequestExamples;

public class ApacheHTTPResponseHandler {
    public static void main(String[] args) {
        /*
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://localhost/json");

        ResponseHandler<MyJsonObject> rh = new ResponseHandler<MyJsonObject>() {

            @Override
            public JsonObject handleResponse(
                    final HttpResponse response) throws IOException {
                StatusLine statusLine = response.getStatusLine();
                HttpEntity entity = response.getEntity();
                if (statusLine.getStatusCode() >= 300) {
                    throw new HttpResponseException(
                            statusLine.getStatusCode(),
                            statusLine.getReasonPhrase());
                }
                if (entity == null) {
                    throw new ClientProtocolException("Response contains no content");
                }
                Gson gson = new GsonBuilder().create();
                ContentType contentType = ContentType.getOrDefault(entity);
                Charset charset = contentType.getCharset();
                Reader reader = new InputStreamReader(entity.getContent(), charset);
                return gson.fromJson(reader, MyJsonObject.class);
            }
        };

        MyJsonObject myjson = client.execute(httpget, rh);
        */
    }
}
