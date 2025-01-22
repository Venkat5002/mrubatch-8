package com.mru.addition;

public class AdditionImpl implements Addition {

	@Override
	public void Add1() {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		int res  = num1 + num2;
		System.out.println(res);
	}

	@Override
	public void Add2(int num1, int num2) {
		// TODO Auto-generated method stub
		int res  = num1 + num2;
		System.out.println(res);
	
	}

	@Override
	public int Add3() {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=200;
		int res  = num1 + num2;
		return res;
	}

	@Override
	public int Add4(int num1, int num2) {
		// TODO Auto-generated method stub
		int res  = num1 + num2;
		return res;
	}

}
