package com.tns.interfacedemo;

public interface BankMain {
	public static void main(String a[]) {
		BankImple b=new BankImple();
		b.deposit(1000);
		b.withdraw(1000);
		
	}

}
