package com.bit.am;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05 {

	public static void main(String[] args) {
//		ArrayList list=new ArrayList();//2636  40498
		LinkedList list=new LinkedList();//5930
		long before=System.currentTimeMillis();
		for(int i=0; i<100000000; i++){
			list.add(i);
		}
		long after=System.currentTimeMillis();
		System.out.println(after-before);

	}

}














