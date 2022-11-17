package org.study.utilEx;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println(new Date());
		
		System.out.println("=====LocalDate======");
		
		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		
		System.out.println(ldate.getYear());		// 년
		System.out.println(ldate.getMonth());		// 월, 객체 (영어)
		System.out.println(ldate.getMonthValue());	// 월 (숫자)
		System.out.println(ldate.getDayOfYear());	// 일 (년기준 365일중  몇번째 일인지)
		System.out.println(ldate.getDayOfMonth());	// 일 (달기준 현재 날짜)
		System.out.println(ldate.getDayOfWeek());	// 요일(영어)
		System.out.println(ldate.isLeapYear());		// 윤년 여부(2월29일)
		
		LocalDate ldate2 = LocalDate.of(2022, 11, 17);
		System.out.println(ldate2);
	}
}
