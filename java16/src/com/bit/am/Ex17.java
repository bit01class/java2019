package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex17 {

	public static void main(String[] args) {
		Set tree=new TreeSet();
//		tree=new HashSet();
		tree.add(new Target());
		tree.add(new Target());
		tree.add(new Target());
		tree.add(new Target());
		
		Iterator ite = tree.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}

}










