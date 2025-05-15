package com.tns.collectiondemo;

import java.util.LinkedList;
import java.util.List;

//List Interafce Methods

public class ListInterfaceMeth {
	
	public static void main(String a[]) {
		 List <Integer> l=new LinkedList <Integer>();
		 l.add(21);
		 l.add(34);
		 l.add(56);
		 l.add(90);
		 l.add(78);
		 
		 //adding at index position
		 l.add(1, 5);
		 
		 //modify element at index position
		 l.set(3, 3);
		 
		 //delete element at index position
		 l.remove(3);
		 
		 for(int i:l)
		 System.out.println("The elements are"+i);
		 
		 System.out.println(l.get(3));
		 
		 System.out.println("The size of linkedlist"+l.size());
		 
		 
	}

}
