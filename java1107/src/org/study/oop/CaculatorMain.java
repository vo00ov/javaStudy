package org.study.oop;

import java.util.Scanner;

public class CaculatorMain {

	public static void main(String[] args) {

		// Caculator 생성한 후에 필드 num1, num2, op를 초기화
		// op에 따라서 +-*/% -> if~else if 이용해서
		// 메서드 sum(+), sub(-), muti(*), div(/), rem(%)
		// 호출하는 프로그램을 작성하시오.

		Caculator c1 = new Caculator();
		// Caculator 생성한 후에 필드 num1, num2, op를 초기화

		Scanner sc = new Scanner(System.in);

		System.out.println("실행하시겠습니까? (yes or no)");
		c1.yn = sc.nextLine();

		// op에 따라서 +/*-% -> if~else if이용해서

		while (true) {
			
			if (c1.yn.equals("no")) {
				c1.no();
				break;
			} else if(c1.yn.equals("yes")) {
//				c1.yes();

				System.out.print("첫번재 숫자 : ");
				c1.num1 = sc.nextInt();

				System.out.print("연산자 입력 (+ - * / %) : ");
				c1.op = sc.next();

				System.out.print("두번재 숫자 : ");
				c1.num2 = sc.nextInt();
			} else {
				System.out.println("입력오류");
			}
			
			if (c1.op.equals("+")) {
				c1.sum();
			} else if (c1.op.equals("-")) {
				c1.sub();
			} else if (c1.op.equals("*")) {
				c1.muti();
			} else if (c1.op.equals("/")) {
				c1.dev();
			} else if (c1.op.equals("%")) {
				c1.rem();
			} else {
				System.out.println("연산 오류");
			}
			
		}
		sc.close();

	}
}
