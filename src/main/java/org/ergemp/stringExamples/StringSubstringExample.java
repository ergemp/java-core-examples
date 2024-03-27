package org.ergemp.stringExamples;

public class StringSubstringExample {
    public void run()
    {
        String sDate = "2017-08-01T13:45:47.761204Z";
        String sRet = "";

        System.out.println(sDate.substring(0, 4));
        System.out.println(sDate.substring(5, 7));
        System.out.println(sDate.substring(8, 10));

        System.out.println(sDate.substring(11, 13));
        System.out.println(sDate.substring(14, 16));
        System.out.println(sDate.substring(17, 19));

        sRet = sDate.substring(0, 4) + "-" +
                sDate.substring(5, 7) + "-" +
                sDate.substring(8, 10) + "_" +
                sDate.substring(11, 13) +
                sDate.substring(14, 16) +
                sDate.substring(17, 19);

        System.out.println(sRet);

        Integer indT = sDate.trim().indexOf("T");
        Integer indS = sDate.trim().indexOf(":", indT);

        System.out.println(sDate.substring(indT+1,indS));
    }
}
