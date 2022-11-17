package org.study.utilEx;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalEx2 {

	public static void main(String[] args) {

		// 날짜를 비교 할 수 있다.
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2023, 01, 22, 12, 23, 42);
		
		System.out.println("기준날짜 : " + start);
		System.out.println("비교날짜 : " + end);
		
		// 이전 날짜인가?
		boolean bool = start.isBefore(end);		// true
		System.out.println(bool);
		
		// 같은 날짜인가?
		bool = start.isEqual(end);				// false
		System.out.println(bool);
		
		// 이후 날짜인가?
		bool = start.isAfter(end);				// false
		System.out.println(bool);
		
		if(start.isAfter(end)) {
			System.out.println("선택날짜 이후");
		}else {
			System.out.println("이후가 아니다");
		}
		
		/////////////////////////////////////////////////////////////////
		
		ZonedDateTime utcZone = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZone);
		
		ZonedDateTime seoulZone = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulZone);
		
		
		
	}
}
