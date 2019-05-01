package com.bit.am;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Ex16 {

	public static void main(String[] args) {
		// 로또번호생성기
		Set lotto=new HashSet();
		Set lotto2=new TreeSet();
		while(true){
			if(lotto.size()==6){break;}
			// 1 ~ 45 -> 0 ~ 44  +1;
			int num=(int)(Math.random()*45)+1;
			lotto.add(num);
		}
		
		Iterator ite = lotto.iterator();
		while(ite.hasNext()){
			System.out.print(ite.next()+" ");
		}

	}

}





















