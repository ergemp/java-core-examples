package org.ergemp.jschExamples;

import com.jcraft.jsch.*;

import java.io.File;
import java.io.IOException;

public class JschKeyAuthSftp {
    public static void main(String[] args) throws JSchException, SftpException, InterruptedException, IOException
    {
        //Define the key file
        File file = new File("dwh-hadoop2.pem");
        String user = "centos" ;
        String host = "52.28.83.249" ;
        Integer port = 22 ;

        JSch jsch=new JSch();
        jsch.addIdentity(file.getAbsoluteFile().toString());
        jsch.setConfig("StrictHostKeyChecking", "no");


        System.out.println("Key file is: " + file.getAbsoluteFile().toString());

        System.out.println("creating session...");
        Session session = jsch.getSession(user, host, port);

        System.out.println("creating connection...");
        session.connect();

        System.out.println("connection create success...");

        Thread.sleep(2000);

        //get file example
        Channel channel = session.openChannel("sftp");
        channel.setInputStream(null);
        channel.setOutputStream(null);
        channel.connect();

        ChannelSftp c = (ChannelSftp) channel;

        String fileName = "test.txt";
        c.get("tt", "tt");
        c.exit();
        System.out.println("files recieved success...");

        //disconnect channel and session
        System.out.println("disconnecting...");
        channel.disconnect();
        session.disconnect();
    }
}
