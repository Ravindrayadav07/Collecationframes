package com.collecation;
import java.util.LinkedList;
public class LinkedListex {
public static void main(String [] args) {
  LinkedList <Integer>a1=new LinkedList();
  a1.add(null);
	a1.add(5);
//	a1.add(2.5);
	a1.add(8);
	a1.add(19);
	System.out.println(a1);
	a1.remove(3);
	System.out.println(a1);
	a1.set(2,15);
	a1.addFirst(5);
	a1.addLast(9);
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.getFirst());
	System.out.println(a1.getLast());
	for(int i=0;i<a1.size();i++) {
		System.out.println(a1.get(i));
	}
	a1.addAll(a1);
	System.out.println(a1);
}
}
