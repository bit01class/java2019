package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;

public class Ex15 {

	public static void main(String[] args) {
		// set  (����)
		java.util.Set set1=new HashSet();
		set1.add("ù��°");
		set1.add("�ι�°");
		set1.add("����°");
		set1.add("ù��°");
		set1.add("�ι�°");
		set1.add("ù��°");
		System.out.println(set1.size());
		
		Iterator ite = set1.iterator();// �ݺ���
		
		while(ite.hasNext()){
			String msg=(String) ite.next();
			msg="�ٲ�";
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


















