package com.collecation;
class Employee{
	String id;
	String name;
     double sal;
     Employee(String id,String name,double sal){
    	 this.id=id;
    	 this.name=name;
    	 this.sal=sal;
     }
     public void display() {
    	 System.out.println("Emplyee data :"+name+" id "+id+" salary "+sal);
    	 
     }
}
public class ArrayOfObjects {
	public static void main(String[] args) {
		//declare array of students
		Employee [] arr;
		//size
		arr=new Employee[3];
		//inti
		arr[0]=new Employee("s101","vikash",50000.0);
		arr[1]=new Employee("s102","vijay",34000.10);
		arr[2]=new Employee("s103","rajesh",45000.30);
	//	arr[0].setData(101,"abc","A");
		
		System.out.println("first Employe data=");
		arr[0].display();
		System.out.println("second Employe data=");
		arr[1].display();
		System.out.println("third Employe data=");
		arr[2].display();
}
}
