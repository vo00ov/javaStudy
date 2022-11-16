package org.study.basicPackge;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		System.out.println("====Date====");
		
		Date now =  new Date();
		System.out.println(now);
		
		System.out.println(now.getYear() + 1900);	// 년 -> 1900년대에서 122년 지나서 반드시 +1900년을 해줘야 한다
		System.out.println(now.getMonth() + 1); 	// 월 -> 1부터 시작이 아닌 0부터 계산하므로 +1을 해줘야한다
		System.out.println(now.getDate());			// 일
		System.out.println(now.getHours());			// 시간
		System.out.println(now.getMinutes());		// 분
		System.out.println(now.getSeconds());		// 초
		System.out.println(now.getDay());			// 요일 -> 0=일 1=월 ... 토 =6 switch나 조건문으로 계산을 해야 문자열로 나온다
				
		System.out.println((now.getYear()+1900) + "년"
						+ (now.getMonth()+1) + "월"
						+ now.getHours() + "시" 
						+ now.getMinutes() + "분" 
						+ now.getSeconds() + "초");
	}
}
