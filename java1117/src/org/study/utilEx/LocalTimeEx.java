package org.study.utilEx;

import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		System.out.println("=====LocalTime=====");
		
		LocalTime ltime = LocalTime.now();
		System.out.println(ltime);
		
		System.out.println(ltime.getHour());	// 시간
		System.out.println(ltime.getMinute());	// 분
		System.out.println(ltime.getSecond());	// 초
		System.out.println(ltime.getNano());	// 밀리세컨드
		
		System.out.println();
		
		LocalTime ltime2 = LocalTime.of(15, 54, 15);	// 임의의 시간 설정
		System.out.println(ltime2);
		
		System.out.println(ltime2.getHour());
		System.out.println(ltime2.getMinute());
		System.out.println(ltime2.getSecond());
	}
}
