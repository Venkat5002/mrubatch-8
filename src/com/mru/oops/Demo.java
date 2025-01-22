package com.mru.oops;

abstract class Test2{
	public void m1() {
		System.out.println("M1 method");
	}

public abstract void m2();

}

class Test3 extends Test2{

	@Override
	public void m2() {
		System.out.println("m2 method");
		// TODO Auto-generated method stub
		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test3 obj = new Test3();
obj.m1();
obj.m2();

	}

}
