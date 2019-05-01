package com.bit.am;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {
		Set<Target4> set=new TreeSet<Target4>();
		set.add(new Target4(2222));
		set.add(new Target4(9999));
		set.add(new Target4(7777));
		set.add(new Target4(9999));
		set.add(new Target4(7777));
		set.add(new Target4(3333));
		
		Iterator<Target4> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}

}








