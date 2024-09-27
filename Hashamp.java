package com.collecation;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Hashamp {
	 public static void main(String[] args) {
		HashMap<Double,String> hs=new HashMap<Double,String>();
		hs.put(300.01,"hindi");
		hs.put(400.50,"english");
		hs.put(200.01,"maths");
		hs.put(350.01,"aptitude");
		Set<Entry<Double, String>> s=hs.entrySet();
		for(Entry<Double, String> it:s) {
			if(it.getKey().equals(350.01)) {
			it.setValue("scince");
			}
			System.out.println("books entry "+it.getKey()+" "+it.getValue());
		
		}
		
	
	}

}
