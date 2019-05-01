package com.bit.pm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ex06 {

	public static void main(String[] args) {
		Date now=new Date();
//		java.text.DateFormat df=null;
//		String format="YY.MM.DD";
//		String msg=DateFormat.getDateInstance().format(now);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//		String msg=df.format(now);
//		System.out.println(msg);
		
		SimpleDateFormat sdf=null;
		sdf=new SimpleDateFormat("yyyy≥‚MMø˘dd¿œ HH:mm:ss");
//		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
//		sdf.setTimeZone(tz);
		String msg=sdf.format(now);
		System.out.println(msg);
		
	}

}













