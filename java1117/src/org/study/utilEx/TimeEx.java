package org.study.utilEx;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeEx {

	public static void main(String[] args) {
		// 1970.01.01
		long time = System.currentTimeMillis();
		System.out.println("시스템 밀리초 구하기 : " + time);
		
		long time1 = System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
		
		System.out.println("경과시간(초) 구하기 : " + (time1 + time2) / 1000.0);
		
		TimeZone us = TimeZone.getTimeZone("US/Samoa");
		TimeZone eu = TimeZone.getTimeZone("Europe/London");
		
		System.out.println(us);
		System.out.println(eu);
		
		Calendar ca1 = Calendar.getInstance(us);		
		Calendar ca2 = Calendar.getInstance(eu);		
		
		System.out.println(ca1.get(Calendar.YEAR));
		
		
	}
}
