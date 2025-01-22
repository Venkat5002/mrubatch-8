package com.mru.addition;

public class SubtractionImpl extends AdditionImpl implements Subtraction {

	@Override
	public void Sub1() {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		int res  = num1 -  num2;
		System.out.println(res);
	}

	@Override
	public void Sub2(int num1, int num2) {
		// TODO Auto-generated method stub
		int res  = num1 -  num2;
		System.out.println(res);
	
	}

	@Override
	public int Sub3() {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		int res  = num1 -  num2;
		return res;
	}

	@Override
	public int Sub4(int num1, int num2) {
		// TODO Auto-generated method stub

		int res  = num1 -  num2;
		return res;
	}

}
