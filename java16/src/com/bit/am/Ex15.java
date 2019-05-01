package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;

public class Ex15 {

	public static void main(String[] args) {
		// set  (집합)
		java.util.Set set1=new HashSet();
		set1.add("첫번째");
		set1.add("두번째");
		set1.add("세번째");
		set1.add("첫번째");
		set1.add("두번째");
		set1.add("첫번째");
		System.out.println(set1.size());
		
		Iterator ite = set1.iterator();// 반복자
		
		while(ite.hasNext()){
			String msg=(String) ite.next();
			msg="바꿈";
			System.out.println(msg);
		}
		System.out.println("-------------------------");
		ite = set1.iterator();
		while(ite.hasNext()){
			String msg=(String) ite.next();
			System.out.println(msg);
		}
		
//		System.out.println(ite.hasNext());
//		System.out.println(ite.next());
//		System.out.println(ite.hasNext());
//		System.out.println(ite.next());
//		System.out.println(ite.hasNext());
//		System.out.println(ite.next());
//		System.out.println(ite.hasNext());
	}

}


















