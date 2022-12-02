package org.study.jdbc;

import java.util.ArrayList;
import java.util.List;

class User{
	
	private String userId;
	private String userPw;
	private int age;
	
	public User(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


public class Test1202 {

	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(new User("m1", "1111", 11));
		users.add(new User("m2", "2222", 21));
		users.add(new User("m3", "3333", 31));
		users.add(new User("m4", "4444", 41));
		users.add(new User("m5", "5555", 51));
		
		// foreach 출력
		
		for(User a : users) {
			System.out.print(a.getUserId()+ " ");
			System.out.print(a.getUserPw()+ " ");
			System.out.print(a.getAge() + "\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 컬렉션
		List<Integer> lists1 = new ArrayList<Integer>();
		ArrayList<Integer> lists2 = new ArrayList<Integer>();
		// list에 추가
		lists1.add(new Integer(10));
		lists1.add(new Integer(20));
		lists1.add(new Integer(30));
		lists1.add(new Integer(40));
		lists1.add(new Integer(50));
		// list에 출력
		System.out.println(lists1.get(0));
		System.out.println(lists1.get(1));
		System.out.println(lists1.get(2));
		System.out.println(lists1.get(3));
		System.out.println(lists1.get(4));
		
		System.out.println("=========================");
		
		// for -> 갯수가 정해져 있다
		for(int i=0; i<lists1.size(); i++) {
			System.out.print(lists1.get(i) + " ");
		}
		System.out.println();
		System.out.println("=========================");
		// foreach -> 모든 list요소 출력
		for(Integer i : lists1) {
			System.out.print(i + " ");
		}
	}
}
