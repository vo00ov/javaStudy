package org.study.basicPackage;

class Obj1{
	int num1;
}

public class ObjectEx {

	public static void main(String[] args) {
		
		Obj1 ob1 = new Obj1();
		Obj1 ob2 = new Obj1();
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob1.getClass());
		System.out.println(ob2.getClass());
		System.out.println(ob1.getClass().getName());
		System.out.println(ob2.getClass().getName());
		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
	}
}
