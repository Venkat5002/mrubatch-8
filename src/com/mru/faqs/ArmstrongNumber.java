package com.mru.faqs;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// read number dynamically
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = scanner.nextInt();
		
		int num2=num;  //backup reasons
		
		//read no.of.digits
		int digits = String.valueOf(num).length(); // 153 ---- 3  1634 --- 4
		
		int sum=0;
		while (num!=0) {
			int last = num%10;
			sum+=Math.pow(last,  digits);
			num=num/10;
		}
	System.out.println(num2 == sum ? "ArmStrong !!! " : " Not ArmStrong");
	}
}
