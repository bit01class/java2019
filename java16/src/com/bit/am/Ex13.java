package com.bit.am;

import java.util.Deque;
import java.util.LinkedList;

public class Ex13 {

	public static void main(String[] args) {
		Deque deq1=new LinkedList();
//		deq1.offerFirst(1111);
//		deq1.offerFirst(2222);
//		deq1.offerFirst(3333);
//		deq1.offerFirst(4444);
		deq1.offerLast(1111);
		deq1.offerLast(2222);
		deq1.offerLast(3333);
		deq1.offerLast(4444);
		
		System.out.println(deq1.pollLast());
		System.out.println(deq1.pollLast());
		System.out.println(deq1.pollLast());
		System.out.println(deq1.pollLast());
		
//		System.out.println(deq1.pollFirst());
//		System.out.println(deq1.pollFirst());
//		System.out.println(deq1.pollFirst());
//		System.out.println(deq1.pollFirst());
		

	}

}
