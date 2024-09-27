package com.collecation;

import java.util.HashMap;

public class Hashsets {
public static void main(String[] args) {
	HashMap<Integer,String>hs=new HashMap();
	hs.put(null, "rajesh");
	hs.put(1,"aman");
	hs.put(2, "vishal");
	hs.put(3,"vijay");
	hs.put(4,"ramesh");
	System.out.println(hs.get(null));
	hs.remove(3);
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	System.out.println(hs.containsKey(1));
	System.out.println(hs);
	hs.clear();
	System.out.println(hs);
}
}
