package org.study.utilEx;

import java.time.LocalDateTime;

public class LocalEx1 {

	public static void main(String[] args) {
		// 날짜 조절
		// .plus~ (+) , .min~ (-)
		// LocalTime, LocalDateTime, ZonedDateTime
		// 클래스는 각각 시간, 분, 초, 나노초를 더하거나 뺄 수 있다.
		
		LocalDateTime curDateTime = LocalDateTime.now();
		LocalDateTime tarDateTime = curDateTime.plusYears(11);	// 년도  더하기
		System.out.println("현재날짜 시간 : " + curDateTime);
		System.out.println("조절날짜 시간 : " + tarDateTime);
		
		tarDateTime = curDateTime.plusMonths(5);	// 월 더하기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.minusMonths(4);	// 월 빼기
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.plusDays(12);		// 일 더하기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.minusDays(55);	// 일 빼기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.plusWeeks(23);	// 주 더하기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.minusDays(42);	// 주 빼기
		System.out.println(tarDateTime);
	}
}
