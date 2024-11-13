package org.ergemp.apacheCommons.commonsCli;


public class CommonsCli {
    public static void main(String[] args)
    {
        //option_parser optionParser = new option_parser();
        if (OptionParser.option_parser(args))
        {
            Runner.run(OptionParser.options, OptionParser.cmd);
        }
    }
}
