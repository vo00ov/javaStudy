package org.study.basicPackge;

import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		System.out.println("====Date====");

		Date now = new Date();
		System.out.println(now);

		int weekday = now.getDay();

		// 일 = 0 , 월 = 1, 화 = 2, 수 = 3, 목 = 4, 금 = 5, 토 = 6
		// switch문 이용해서 오늘 날짜를 Date의 getDay() 이용해서
		// 콘솔에 요일을 출력해세요

		switch (weekday) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;

		default:
			System.out.println("잘못된 값인데 나올리가 없겟죠?");
			break;
		}

		if (weekday == 0) {
			System.out.println("일");
		} else if (weekday == 1) {
			System.out.println("월");
		} else if (weekday == 2) {
			System.out.println("화");
		} else if (weekday == 3) {
			System.out.println("수");
		} else if (weekday == 4) {
			System.out.println("목");
		} else if (weekday == 5) {
			System.out.println("금");
		} else if (weekday == 6) {
			System.out.println("토");
		} else {
			System.out.println("잘못된 숫자이지만 저 외에는 안나올듯");
		}
	}
}
