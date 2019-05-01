package com.bit.am;

import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	static class Test{}

	public static void main(String[] args) {
		// Map (key, value)
		java.util.Map map1=new java.util.HashMap();
		map1.put(0, "ab");
		map1.put(5, null);
		map1.put("a", "ABC");
		map1.put('a', 123434);
		map1.put(null, 'a');
		
		map1.remove(5);
		
		Set keys = map1.keySet();
		
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			Object key=ite.next();
			System.out.println("key:"+key+",value:"+map1.get(key));
		}
		
		
//		Object[] keys={0,5,"a",'a',null};
//		
//		for(int i=0; i<keys.length; i++){
//			System.out.println(map1.get(keys[i]));
//		}
		

//		System.out.println(map1.get(0));
//		System.out.println(map1.get(5));
//		System.out.println(map1.get(10));
//		
//		map1.put(5, null);
//
//		System.out.println(map1.get(0));
//		System.out.println(map1.get(5));
		
		
	}

}
