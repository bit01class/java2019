package com.bit.am;

import java.util.LinkedList;
import java.util.Queue;

public class Ex11 {

	public static void main(String[] args) {
		// Ω∫≈√ - LIFO (Last-In-First-Out) 
		// ≈• - FIFO (First-In-First-Out) 
		Queue q1=new LinkedList();
		q1.offer(1111);
		q1.offer(2222);
		q1.offer(3333);
		q1.offer(4444);
		
		while(q1.peek()!=null){
			System.out.println(q1.poll());
			
		}
	}

}






















