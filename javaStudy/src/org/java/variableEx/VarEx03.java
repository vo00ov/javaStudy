package org.java.variableEx;

public class VarEx03 {

	public static void main(String[] args) {
		System.out.println("===변수이름 규칙===");
		
//		int int;	//	키워드(에약어)를 사용할 수 없다.
//		int 1var;	//	숫자로 시작하지 않는다.
//		int m var;	//	공백을 허용하지 않는다.
		int _var1 = 10;
		int $var2 = 20;
//		int var%dd;	//	_ , $ 이외의 특수문자 사용이 안된다.
//		int var**dd;//	_ , $ 이외의 특수문자 사용이 안된다.
		
		int Var1 = 10;	//	대소문자를 구분한다.
		int var1 = 20;
		System.out.println(Var1==var1);
		
		System.out.println("===권고사항===");
		
		int avar = 10;	//	소문자로 시작하자.
		int varNumber;	//	다른 문자가 시작되면 대문자로 시작하자.
		
		int 변수 = 100;	// 한글은 사용하지 말자.
		System.out.println(변수);
	}
}
