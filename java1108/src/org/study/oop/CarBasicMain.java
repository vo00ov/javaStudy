package org.study.oop;

public class CarBasicMain {

	public static void main(String[] args) {
		// 필드를 초기화 하고 콘솔에 출력
		// getters, setters를 이용해서 실행

		// 기본생성자 생성
		CarBasic n1 = new CarBasic();

		n1.setCarName("CAR1");
		n1.setCarYear(2020);
		n1.setCarCoin(10020);
		System.out.println("carName : " + n1.getCarName());
		System.out.println("carYear : " + n1.getCarYear());
		System.out.println("carCoin : " + n1.getCarCoin());
		System.out.println();

		// 생성자2
		CarBasic n2 = new CarBasic("CAR2");

//		n2.setCarName("CAR2");
		n2.setCarYear(2016);
		n2.setCarCoin(5320);
		System.out.println("carName : " + n2.getCarName());
		System.out.println("carYear : " + n2.getCarYear());
		System.out.println("carCoin : " + n2.getCarCoin());
		System.out.println();


		// 생성자3
		CarBasic n3 = new CarBasic("CAR3", 2022);
		
//		n3.setCarName("CAR3");
//		n3.setCarYear(2022);
		n3.setCarCoin(450);
		System.out.println("carName : " + n3.getCarName());
		System.out.println("carYear : " + n3.getCarYear());
		System.out.println("carCoin : " + n3.getCarCoin());
		System.out.println();


		// 생성자4
		CarBasic n4 = new CarBasic("CAR4", 2023, 50000);
		
//		n4.setCarName("CAR4");
//		n4.setCarYear(2023);
//		n4.setCarCoin(50000);
		System.out.println("carName : " + n4.getCarName());
		System.out.println("carYear : " + n4.getCarYear());
		System.out.println("carCoin : " + n4.getCarCoin());

	}

}
