package com.tns.generics;

public class MathOperations {
	
		public static void main(String args[]) {
		//parameters->{statements};
		MathCal add=(a,b)->a+b;
		MathCal mul=(a,b)->a*b;
		System.out.println(add.cal(10,20));
		System.out.println(mul.cal(10,20));
		
		
		
		
		}
		
	}


