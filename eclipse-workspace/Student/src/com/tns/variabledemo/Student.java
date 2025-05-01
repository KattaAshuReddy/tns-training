package com.tns.variabledemo;
//Demo for static variables

public class Student {
	int sid;
	String sname;
	 static String clgname="Sri Indu";//called by className
	 void display() {
		 System.out.println("The details of students are:"+sid+","+sname+","+Student.clgname);
	 }
}
	
