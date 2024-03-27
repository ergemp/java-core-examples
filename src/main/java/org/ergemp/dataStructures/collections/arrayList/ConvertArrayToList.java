package org.ergemp.dataStructures.collections.arrayList;

import org.ergemp.dataStructures.collections.arrayList.util.Nvl;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main (String[] args)
    {
        String strCSV = "PV,scroll,refinement,CampaignProductListing,PSSearchProductListing,productClick,SeasonSearchProductListing,SeasonSearchProductListing,BrandProductListing,CategoryProductListing,productView";
        String strCSV2 = "ttt,scroll";
        String strSearch = "scroll";

        Arrays.asList(strCSV.replace(" ", "")).contains(strSearch);
        strCSV.replace(" ", "").contains(strSearch);
        Nvl.nvl(strCSV2.replace(" ", ""),strSearch).contains(strSearch);

        // create a string array
        String[] firstArray = {"first","second","third"};
        System.out.println("firstArrays first element: " + firstArray[0]);

        // convert CSV string to String Array
        String[] strArray = strCSV.split(",");
        System.out.println("Array Length: " + strArray.length);

        //getting and setting array elements
        System.out.println("3rd element: " + strArray[2]);

        strArray[2] = "new element";
        System.out.println("3rd element: " + strArray[2]);

        //convert array to list
        List<String> strList = Arrays.asList(strArray);

        //convert list to array
        String[] strArray2 = strList.toArray(new String[strList.size()]);
        System.out.println("strArray2 Length: " + strArray2.length);

        //convert list to array with copy of
        Object[] objArray = strList.toArray();
        String[] strArray3 =  Arrays.copyOf(objArray, objArray.length,String[].class);

        System.out.println("strArray3[2]: " + strArray3[2]);


    }
}
