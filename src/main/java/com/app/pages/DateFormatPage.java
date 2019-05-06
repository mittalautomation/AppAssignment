package com.app.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatPage {
	DateFormatPage()
	{
		
	}
	static Date getDateObject(String strDate) throws ParseException {
        SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
        sdfrmt.setLenient(false);
        return sdfrmt.parse(strDate);
    }

   static boolean isBetween(Date fromDate, Date toDate, Date date){
        return date.compareTo(fromDate) >= 0 && date.compareTo(toDate) <= 0;
    }
}
