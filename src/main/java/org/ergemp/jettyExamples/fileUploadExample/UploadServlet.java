package org.ergemp.jettyExamples.fileUploadExample;

import org.eclipse.jetty.http.HttpMethod;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.util.MultiPartInputStreamParser;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class UploadServlet extends HttpServlet {

    public static void enableMultipartSupport(HttpServletRequest request) {
        request.setAttribute(Request.MULTIPART_CONFIG_ELEMENT,MULTI_PART_CONFIG );
    }

    //private static final MultipartConfigElement MULTI_PART_CONFIG = new MultipartConfigElement("./jetty_toolkit/www/upload");
    private static final MultipartConfigElement MULTI_PART_CONFIG = new MultipartConfigElement("./src/main/java/org/ergemp/jettyExamples/fileUploadExample/www/upload");
    public static final String MULTIPART_FORMDATA_TYPE = "multipart/form-data";

    public static boolean isMultipartRequest(ServletRequest request) {
        return request.getContentType() != null
                && request.getContentType().startsWith(MULTIPART_FORMDATA_TYPE);
    }

    private final String UPLOAD_DIRECTORY = "./src/main/java/org/ergemp/jettyExamples/fileUploadExample/www/upload";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);

        boolean multipartRequest = HttpMethod.POST.is(req.getMethod())
                && isMultipartRequest(req);

        if (multipartRequest) {
            enableMultipartSupport(req);
        }

        //String uploadPath = getServletContext().getRealPath(".") + File.separator + UPLOAD_DIRECTORY;
        String uploadPath = UPLOAD_DIRECTORY;
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdir();

        for (Part part : req.getParts()) {
            String fileName = part.getSubmittedFileName();

            InputStream is = ((MultiPartInputStreamParser.MultiPart) part).getInputStream();

            byte[] buffer = new byte[is.available()];
            is.read(buffer);

            File targetFile = new File(uploadPath + File.separator + fileName);
            OutputStream outStream = new FileOutputStream(targetFile);
            outStream.write(buffer);

            //part.write(uploadPath + File.separator + fileName);
            resp.setStatus(HttpServletResponse.SC_OK);
        }
    }
}
