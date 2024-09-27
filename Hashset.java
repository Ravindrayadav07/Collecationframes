package com.collecation;
import java.util.Collections;
import java.util.HashSet;
public class Hashset {
public static void main(String[] args) {
	//duplicate not allowed
	HashSet h1=new HashSet(100,(float)0.90);
//	h1.add(100);
	//h1.add(5);
	//h1.add(100);
	//h1.add("raj");
   // System.out.println(h1.hashCode());
  //  h1.remove(h1);
	h1.add(1);
	h1.add(2);
	h1.add(3);
	h1.add(4);
	h1.add(5);
	h1.add(6);
	h1.add(7);
	
System.out.println("set1 " + h1);
            HashSet h2=new HashSet();
            h2.add(1);
        	h2.add(3);
        	h2.add(5);
        	h2.add(7);
        	h2.add(9);
        	h2.add(11);
        	
        System.out.println("set2 "+h2);
       h1.addAll(h2);
       System.out.println("unione "+h1);
     // h1.retainAll(h2);
       System.out.println(h2);
      h1.removeAll(h2);
       System.out.println(h1);
       //Collections.sort(h1); not use collection.sort methods
                 //   Collections.shuffle();
}
}
