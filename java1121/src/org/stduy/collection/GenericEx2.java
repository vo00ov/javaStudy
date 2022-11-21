package org.stduy.collection;

class Gen1 {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}

class Gen2 {
	private String num;

	public void setNum(String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}
}

// Generic Type 클래스
class Gen3<T> {
	private T num;

	public void setNum(T num) {
		this.num = num;
	}

	public T getNum() {
		return num;
	}

}

public class GenericEx2 {

	public static void main(String[] args) {

		// 일반클래스 생성
		Gen1 g1 = new Gen1();
		g1.setNum(10);
		g1.getNum();

		Gen2 g2 = new Gen2();
		g2.setNum("rororororo");
		g2.getNum();

		// 제네릭타입(Integer)
		Gen3<Integer> g3 = new Gen3<Integer>();

		Integer i = 10;

//		g3.setNum(new Integer(10));	// 박싱
//		g3.setNum(i);				// 박싱
		g3.setNum(10); // 자동박싱
		g3.getNum();

		// 제네릭타입(String)
		Gen3<String> g4 = new Gen3<String>();

		g4.setNum("호롤로롤로");
		g4.getNum();

		// 기본타입X -> Wrapper클래스 적용(박싱, 언박싱)
		Gen3<Float> g5 = new Gen3<Float>();
		Gen3<Long> g6 = new Gen3<Long>();
		Gen3<Byte> g7 = new Gen3<Byte>();
		Gen3<Short> g8 = new Gen3<Short>();
		Gen3<Double> g9 = new Gen3<Double>();
		Gen3<Character> g10 = new Gen3<Character>();
		Gen3<Boolean> g11 = new Gen3<Boolean>();

		// 타입비교
		if (g3.getNum() instanceof Integer) {
			System.out.println("Integer");
		}
		if (g4.getNum() instanceof String) {
			System.out.println("String");
		}

		// 다형성
		Object ob = new Integer(10);
		ob = new Float(10.0f);
		ob = new String("문자열");

		Object[] arrObj = { new Integer(10), new Integer(20), 30, 40, 50 };
		Object[] arrObj2 = { new String("문자열1"), new String("문자열2") };

	}
}
