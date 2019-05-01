package com.bit.am;

import java.util.ArrayList;


public class Ex08 {

	public static void main(String[] args) {
		Target ele1=new Target();
		Target ele2=new Target();
		Target ele3=new Target();
		ArrayList list1=new ArrayList();
		list1.add(ele1);
		list1.add(ele2);
		list1.add(ele3);
//		list2.add(4444);
		
		ArrayList list3=list1;
		
//		ArrayList list2=(ArrayList) list1.clone();
		ArrayList list2=new ArrayList(5);
		list2.add(ele1);
		list2.add(ele2);
		list2.add(ele3);
		list2.trimToSize();
		
		
		System.out.println(list1);
		System.out.println(list2);
//		System.out.println(list3);

	}

}










