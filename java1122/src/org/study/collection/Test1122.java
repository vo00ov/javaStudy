package org.study.collection;

class A{
	int n;
	String s1;
	int m1() {
		return 0;
	}
}

class G1<T>{
	T t1;

	T m1(T t2) {
		
		return t2;
	}
}

public class Test1122 {

	public static void main(String[] args) {
		
		G1<String> g1 = new G1<String>();
		g1.t1 = "String";
		String m1 = g1.m1("문자열");
		
		G1<Integer> g2 = new G1<Integer>();
		g2.t1 = new Integer(10);
		g2.t1 = 10;	// 기본 -> 객체 : 자동박싱
		Integer i1 = g2.m1(new Integer(10));
		int i2 = g2.m1(new Integer(10).intValue()); // 언박싱
		int i3 = g2.m1(10); // 객체  -> 기본 : 자동언박싱
		
		// 기본형
		int i = 10;
		
		// 객체형 = new
		String str = new String("문자열");
//		String str2 = "문자열";
		Integer i4 = new Integer(10);
		Integer i41 = 10;
		
		MemberDto dto1 = new MemberDto("KKK", "1234", "가나다", 23);
		MemberDto dto2 = new MemberDto("QQQ", "1534", "일이삼", 21);
		MemberDto dto3 = new MemberDto("WWW", "2454", "에이비씨", 52);
		MemberDto dto4 = new MemberDto("ZZZ", "5224", "원투쓰리", 34);
		MemberDto dto5 = new MemberDto("FFF", "7754", "하나둘셋", 11);
		
		//user1
		System.out.println("========user1==========");
		System.out.print("ID:"+dto1.getUserId() + " ");
		System.out.print("PW:"+dto1.getUserPw() + " ");
		System.out.print("NAME:"+dto1.getUserName()+ " ");
		System.out.print("AGE:"+dto1.getAge()+ "\n");
		
		//user2
		System.out.println("========user2==========");
		System.out.print("ID:"+dto2.getUserId() + " ");
		System.out.print("PW:"+dto2.getUserPw() + " ");
		System.out.print("NAME:"+dto2.getUserName()+ " ");
		System.out.print("AGE:"+dto2.getAge()+ "\n");
		
		//user3
		System.out.println("========user3==========");
		System.out.print("ID:"+dto3.getUserId() + " ");
		System.out.print("PW:"+dto3.getUserPw() + " ");
		System.out.print("NAME:"+dto3.getUserName()+ " ");
		System.out.print("AGE:"+dto3.getAge()+ "\n");
		
		//user4
		System.out.println("========user4==========");
		System.out.print("ID:"+dto4.getUserId() + " ");
		System.out.print("PW:"+dto4.getUserPw() + " ");
		System.out.print("NAME:"+dto4.getUserName()+ " ");
		System.out.print("AGE:"+dto4.getAge()+ "\n");
		
		//user5
		System.out.println("========user5==========");
		System.out.print("ID:"+dto5.getUserId() + " ");
		System.out.print("PW:"+dto5.getUserPw() + " ");
		System.out.print("NAME:"+dto5.getUserName()+ " ");
		System.out.print("AGE:"+dto5.getAge()+ "\n");
		
		
		
	}
}
