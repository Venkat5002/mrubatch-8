package com.mru.oops;
class Test1 implements Interface1{

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 50;
		int res = num1+num2;
		System.out.println("Additions.."+ res);
	}

	@Override
	public int subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1- num2;
		return res;
	}

	@Override
	public void mulipication(int num1, int num2) {
		// TODO Auto-generated method stub
		int res = num1*num2;
		System.out.println("mulipication...."+ res);
		
	}

	@Override
	public int division() {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 50;
		
		int res2 = num1/num2;
		return res2;
	}
	
}


