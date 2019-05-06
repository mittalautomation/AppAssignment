package com.app.pages;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.DateFormatPage;

public class AppOperationPage {

	static BufferedReader readerTrade;
    static BufferedReader readerIns;
    static DateFormatPage datePage;
    
    public AppOperationPage(){
   	 datePage=new DateFormatPage();
    }
	
public static void getInstrumentwiseTradedAndnonTradedList() throws Throwable{
 	 
	try {
        readerIns = new BufferedReader(new FileReader(".\\src\\main\\resources\\inst.txt"));
        List<String> listOfIns = new ArrayList<String>();
        String line = readerIns.readLine();
        while (line != null) 
        {
            line = readerIns.readLine();
            if (line != null)
                listOfIns.add(Arrays.asList(line.split(",")).get(0));
        }           
        readerTrade = new BufferedReader(new FileReader(".\\src\\main\\resources\\trades.txt"));
        HashMap<String, String> keyVal = new HashMap<String, String>();
        String column = readerTrade.readLine();
        List<String> columns = new ArrayList<String>(Arrays.asList(column.split(",")));
        List<String> allLines = new ArrayList<String>();
        while (column != null)
        {
            column = readerTrade.readLine();
            if (column != null)
                allLines.add(column);
        }
        Date fromDate = DateFormatPage.getDateObject("28/12/2017");
        Date toDate = DateFormatPage.getDateObject("08/03/2018");
        HashMap<String, String> volumeMap = new LinkedHashMap<String, String>();
        Set<String> notTradedList = new LinkedHashSet<String>();

        for (String line1 : allLines) {
            List<String> valueOfSingleLine = new ArrayList<String>(Arrays.asList(line1.split(",")));
            int i = 0;
            for (String val : valueOfSingleLine) {
                keyVal.put(columns.get(i), valueOfSingleLine.get(i));
                i++;
            }

            //System.out.println(keyVal);
            Date date = DateFormatPage.getDateObject(Arrays.asList(keyVal.get("TradeDtTime").split(" ")).get(0));

            if (listOfIns.contains(keyVal.get("InstId")) && DateFormatPage.isBetween(fromDate,toDate,date)) {
                if (volumeMap.containsKey(keyVal.get("InstId")) || volumeMap.keySet().size() == 0) {
                    if (volumeMap.keySet().size() == 0) {
                        volumeMap.put(keyVal.get("InstId"), keyVal.get("Qty"));
                    } else {
                        String existingVal = volumeMap.get(keyVal.get("InstId"));
                        volumeMap.remove("InstId");
                       volumeMap.put(keyVal.get("InstId"), String.valueOf(Integer.parseInt(existingVal) + Integer.parseInt(keyVal.get("Qty"))));
                    }
                }else{
                    volumeMap.put(keyVal.get("InstId"), keyVal.get("Qty"));
                }
            }
            if (!(listOfIns.contains(keyVal.get("InstId"))) && !(DateFormatPage.isBetween(fromDate,toDate,date))) {
                notTradedList.add(keyVal.get("InstId"));
            }   
    	}
        System.out.println("Output of 1st TestCase - \n Instrument wise traded volume between the date range : " + volumeMap + "\n");
        System.out.println("Output of 2nd TestCase - \n List of instrument which not traded between the date range :" + notTradedList ); 
    }catch (FileNotFoundException e) {
            e.printStackTrace();        	  
        }   		
	
}
}
    
