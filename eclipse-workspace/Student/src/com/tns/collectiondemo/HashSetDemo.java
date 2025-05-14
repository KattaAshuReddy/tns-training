package com.tns.collectiondemo;

import java.util.Set;
import java.util.HashSet;
//HashSet-->ignores duplicate elements
       //-->insertion order is not preserved

public class HashSetDemo {
	public static void main(String a[]) {
		Set<String> hs=new HashSet<String>();
		hs.add("ashu");
		hs.add("aishu");
		hs.add("aishu");
		hs.add("manju");
		hs.add("govind");
		System.out.println("The elements in interface "+hs);
		
	}

}


