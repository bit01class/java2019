package com.bit.am;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex10 {

	public static void main(String[] args) {
		java.util.List list1=new LinkedList();
		list1.add(1111);
		list1.add(2222);
		list1.add(4444);
		list1.add(5555);
		
		list1.add(2,"ªÔªÔªÔªÔ");
		
		list1.remove(3);
		list1.set(1, "¿Ã¿Ã¿Ã¿Ã");
		
		Iterator ite = list1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
		System.out.println(list1.toString());

	}

}













