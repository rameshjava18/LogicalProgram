package com.ram.it.LogicalTest;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=8;
		System.out.println("a: "+a+" , b: "+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("a: "+a+" , b: "+b);
		
	}

}
