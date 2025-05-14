package com.tns.generics;

public class GenericMethodMain {
	public static void main(String a[]) {
		
		Integer[] intarray= {1,2,3};
		String[] stringarray= {"Ram","Ravi","Raju"};
		
		//call the method
		
		GenericMethodDemo.displayArray(intarray);
		GenericMethodDemo.displayArray(stringarray);
		
		
	}

}
