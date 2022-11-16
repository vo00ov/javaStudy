package org.study.basicPackge;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();	// 싱글톤 -> Dao 설명
		System.out.println(now.getTime());
		
		System.out.println(now.get(Calendar.YEAR)); 		// 년
		System.out.println((now.get(Calendar.MONTH) + 1));	// 월
		System.out.println(now.get(Calendar.DATE));			// 일
		System.out.println(now.get(Calendar.HOUR));			// 시
		System.out.println(now.get(Calendar.HOUR_OF_DAY));	// 시
		System.out.println(now.get(Calendar.MINUTE));		// 분
		System.out.println(now.get(Calendar.SECOND));		// 초
		System.out.println(now.get(Calendar.MILLISECOND));	// 밀리초 1000 -> 1초
		
		// 현재시간 표시
		System.out.println(now.get(Calendar.YEAR) + "년" 
						+	(now.get(Calendar.MONTH ) + 1) + "월"
						+	now.get(Calendar.DATE) + "일" 
						+	now.get(Calendar.HOUR_OF_DAY) + "시"   
						+ 	now.get(Calendar.MINUTE) + "분"
						+	now.get(Calendar.SECOND) + "초"
						+	now.get(Calendar.MILLISECOND));
	}
}
