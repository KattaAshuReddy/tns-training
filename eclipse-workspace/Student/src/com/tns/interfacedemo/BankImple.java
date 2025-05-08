package com.tns.interfacedemo;

public class BankImple implements Bank {
	int balance=3000;
	public void withdraw(int amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.println("balance after withdraw"+balance);
		}
		else
		{
			System.err.println("withdraw amount exceeds");
		}
	}
	public void deposit(int amount)
	{
		if(amount<=deposit_limit)
		{
			balance=balance+amount;
			System.out.println("the balance after deposit"+balance);
		}	
		else
		{
			System.err.println("Deposit amount exceeds");
			
		}
	}
		}
	


