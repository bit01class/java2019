package com.bit.pm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex07 {

	public static void main(String[] args) {
		long now2=System.currentTimeMillis();
		now2+=(24L*60*60*1000*100);
		Date now100=new Date(now2);
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY.MM.dd");
		String msg=sdf.format(now100);
		Calendar cal = sdf.getCalendar();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
	}

}
