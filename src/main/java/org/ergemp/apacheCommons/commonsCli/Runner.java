package org.ergemp.apacheCommons.commonsCli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;

public class Runner {
    public static void run(Options gOptions, CommandLine gCmd)
    {
        if (gCmd.hasOption("modify"))
        {
            System.out.println("option -modify");
        }
        else if (gCmd.hasOption("create"))
        {
            System.out.println("option -create");
        }
    }
}
