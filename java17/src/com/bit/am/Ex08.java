package com.bit.am;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex08 {

	public static void main(String[] args) {
		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(1111);
		set1.add(222);
		set1.add(1111);
		set1.add(3333);
		
		Iterator<Integer> ite=set1.iterator();
		while(ite.hasNext()){
			Integer msg = ite.next();
			System.out.println(msg);
		}
		System.out.println("-------------------");
		List<Integer> arr1=new ArrayList<Integer>(set1);
		for(int i=0; i<arr1.size(); i++){
			System.out.println(arr1.get(i));
		}
		

	}

}












