package com.tns.collectiondemo;

import java.util.List;
import java.util.ArrayList;
public class ListDemo {
	public static void main(String args[]) {
		//wrapper class
		//int-->Integer,float-->Float,double-->Double,short-->Short
		//Generics
		//ArrayList--allows duplicates and preserves insertion order
		List<Integer>ll=new ArrayList<Integer>();
		ll.add(21);
		ll.add(12);
		ll.add(32);
		ll.add(32);
		for(int i:ll)
			System.out.println("The elements in interface "+i);
		}
		
		
	}


