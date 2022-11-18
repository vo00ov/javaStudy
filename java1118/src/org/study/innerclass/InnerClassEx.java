package org.study.innerclass;

public class InnerClassEx {
	// 인스턴스 클래스
	class InstanceClass2{
		int num1;
		void m1() {
			System.out.println("InstanceClass2");
		}
	}
	// static클래스
	static class StaticClass2{
		static void method() {
			System.out.println("StaticClass2");
		}
	}
	void localMethod() {
		// 지역클래스
		class LocalClass2{
			int num2;
			void m2() {
				System.out.println("LocalClass2");
			}
		}
		LocalClass2 loc = new LocalClass2();
		loc.m2();
	}
}
