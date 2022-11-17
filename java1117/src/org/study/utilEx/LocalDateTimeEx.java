package org.study.utilEx;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		System.out.println("=====LocalDateTime======");
		
		LocalDate ldate = LocalDate.now();
		LocalTime ltime = LocalTime.now();
		
		int year = ldate.getYear();
		System.out.println(ldate.getMonth());
		System.out.println(ldate.getMonthValue());
		int month = ldate.getMonthValue();
		int day = ldate.getDayOfMonth();
		
		int hour = ltime.getHour();
		int minute = ltime.getMinute();
		int second = ltime.getSecond();
		
		System.out.println(year + "년" + month + "월" + day + "일 " + hour + "시" + minute + "분" + second + "초" );

		
		
		
		
	}
}
