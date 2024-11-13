package org.ergemp.apacheCommons.commonsCli;

import org.apache.commons.cli.*;

public class OptionParser {
    public static Options options;
    public static CommandLineParser parser;
    public static CommandLine cmd;

    /*
    public static void main(String[] args)
    {
        setOptions();
        parser = new DefaultParser();

        try
        {
            CommandLine cmd = parser.parse(options, args);

            if(cmd.hasOption("t"))
            {
                System.out.println("option t found");
            }
            else
            {
                System.out.println("option t not found");
            }
        }
        catch(ParseException parseEx)
        {
            System.out.println("parse Exception: " + parseEx.getMessage());
            printHelp();
        }
    }
    */

    public static Boolean option_parser(String[] args)
    {
        Boolean retVal = true;

        setOptions();
        parser = new DefaultParser();

        try
        {
            cmd = parser.parse(options, args);
        }
        catch(ParseException parseEx)
        {
            System.out.println("parse Exception: " + parseEx.getMessage());
            printHelp();
            retVal = false;
        }
        finally
        {
            return retVal;
        }
    }

    public static void setOptions()
    {
        // create Options object
        options = new Options();

        // add t option
        options.addOption("modify", false, "display current time");
        options.addOption("create", false, "display current time");
        options.addOption("delete", false, "display current time");
        options.addOption("starttransfer", false, "display current time");
    }

    public static Boolean validateOptions()
    {
        Boolean retVal = true;

        try
        {

        }
        catch(Exception ex)
        {
        }
        finally
        {
            return retVal;
        }
    }


    public static void printHelp()
    {
        System.out.println("-modify : " + options.getOption("modify").getDescription());
    }
}
