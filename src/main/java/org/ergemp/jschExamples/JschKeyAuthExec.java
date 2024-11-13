package org.ergemp.jschExamples;

import com.jcraft.jsch.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class JschKeyAuthExec {
    public static void main(String[] args) throws JSchException, InterruptedException, IOException
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

        //running a command example
        String command = "whoami;hostname";

        Channel channel = session.openChannel("exec");
        channel.setInputStream(null);
        ((ChannelExec)channel).setCommand(command);
        ((ChannelExec)channel).setErrStream(System.err);

        InputStream in = channel.getInputStream();

        channel.connect();

        //start reading the input from the executed commands on the shell
        byte[] tmp=new byte[1024];
        while (true)
        {
            while (in.available() > 0)
            {
                int i = in.read(tmp, 0, 1024);
                if (i < 0) break;
                System.out.print(new String(tmp, 0, i));
            }

            if (channel.isClosed())
            {
                if (in.available() > 0) continue;
                System.out.println("exit-status: " + channel.getExitStatus());
                break;
            }

            try{Thread.sleep(2000);}catch(Exception ee){}
        }

        //disconnect channel and session
        System.out.println("disconnecting...");
        channel.disconnect();
        session.disconnect();
    }
}
