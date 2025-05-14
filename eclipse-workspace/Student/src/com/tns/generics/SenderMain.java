package com.tns.generics;

public class SenderMain {
	public static void main(String a[]) {
		
		Sender<String> ob=new Sender<String>();
		ob.setMessage("Generics");
		System.out.println(ob.getMessage());
		
		Sender<Integer> o=new Sender<Integer>();
		o.setMessage(234567);
		System.out.println(o.getMessage());
		
		
	}

}
