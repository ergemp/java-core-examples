package org.ergemp.apacheCommons.commonsLog4j;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;

public class Log4jExample {
    static Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args)
    {
        Logger rooLogger = Logger.getRootLogger();

        // Set up a simple configuration that logs on the console.
        // This method is hardwired to add to the root logger a ConsoleAppender.
        //BasicConfigurator.configure();

        Logger logger1 = Logger.getLogger("log4j");
        Logger logger2 = Logger.getLogger("log4j.log4j");

        //logger1.setLevel(Level.INFO);
        //logger2.setLevel(Level.INFO);

        logger1.trace("trace log for logger1");
        logger1.debug("debug log for logger1");
        logger1.info("info log for logger1");
        logger1.warn("warn log for logger1");
        logger1.error("error log for logger1");
        logger1.fatal("fatal log for logger1");

        logger2.info("info log for logger2");
        logger2.log(Level.DEBUG, "debug log for logger2");

        logger.trace("trace log for static logger");
        logger.debug("debug log for static logger");
        logger.info("info log for static logger");
        logger.warn("warn log for static logger");
        logger.error("error log for static logger");
        logger.fatal("fatal log for static logger");

        ThirdPartyLogsExample.print("this is my text message");
    }
}
