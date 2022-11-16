package org.study.basicPackge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {

	public static void main(String[] args) {
		
		// 1.날짜 생성
		System.out.println("====SimpleDateFormat====");
		Date now = new Date();
		
		// 2.날짜 포맷 설정
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		// 3.날짜포맷에 날짜를 설정
		String day1 = format.format(now);
		System.out.println(day1);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년MM월dd일 hh:mm:ss");
		String day2 = format2.format(now);
		System.out.println(day2);
		
		Date day3 = new Date(2022-1900, 11-1, 16, 16, 16, 30);
		System.out.println(day3);
		System.out.println(format.format(day3));
		System.out.println(format2.format(day3));
	}
}
