package org.ergemp.apacheCommons.commonsLog4j;


import org.apache.log4j.Logger;

public class ThirdPartyLogsExample {
    static Logger logger = Logger.getLogger(ThirdPartyLogsExample.class);

    public static void print(String gStr)
    {
        logger.info("info from the thirdpartyclass");

        String printStr = "printing from thirdparty.print";
        try
        {
            printStr += " - " + gStr;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            System.out.println(printStr);
        }
    }
}
