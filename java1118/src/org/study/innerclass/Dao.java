package org.study.innerclass;

public class Dao {
	// 싱글톤 패턴
	// 생성자 private

	private Dao() {
		System.out.println("Dao");
	}
	
	private static class InnerClass{
		// 인스턴스 1번만 생성
		private static final Dao INSTANCE = new Dao();
	}
	
	public static Dao getInstance() {
		return InnerClass.INSTANCE;
	}
	
	public void insert() {System.out.println("가입");}
	public void select() {System.out.println("조회");}
	public void update() {System.out.println("생성");}
	public void delete() {System.out.println("삭제");}
}
