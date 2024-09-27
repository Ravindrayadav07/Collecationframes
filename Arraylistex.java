package com.collecation;

import java.util.ArrayList;

public class Arraylistex {
public static void main(String [] args) {
	ArrayList<Integer> a1=new ArrayList ();
	a1.add(null);
	a1.add(5);
	a1.add(8);
	a1.add(19);
	System.out.println(a1);
	a1.remove(3);
	System.out.println(a1);
	a1.set(2,15);
	System.out.println(a1);
	a1.contains("100");
	System.out.println(a1.contains("100"));
	System.out.println(a1.get(2));
	for(Object o: a1) {
		System.out.println("value of arraylist :"+o);
	}
}
}
