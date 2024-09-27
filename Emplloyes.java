package com.collecation;

public class Emplloyes implements Comparable<Emplloyes>{
	int empId;
	 String name;
	 int age;
	 Emplloyes(int empId,String name,int age){
		 this.empId=empId;
		 this.name=name;
		 this.age=age;
	 }
	@Override
	
	public int compareTo(Emplloyes o) {
		// TODO Auto-generated method stub
		if(age==o.age) {
			return 0;
		}else if(age>o.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
