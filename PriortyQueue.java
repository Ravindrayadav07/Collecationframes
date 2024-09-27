package com.collecation;
import java.util.PriorityQueue;
public class PriortyQueue {
	public static void main(String[] args) {
		PriorityQueue q= new PriorityQueue();
		q.add("java");
		q.add("sql");
		q.add("python");
		q.add("react");
		q.offer("node.js");
		System.out.println(q.remove());
 
		q.poll();
		System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.element());

	}
	

}
