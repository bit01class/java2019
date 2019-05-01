package com.bit.am;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		Map<String,String> map =new HashMap<String,String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put(null, "value4");
		
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			System.out.println("key:"+key+",val:"+map.get(key));
		}
		
		System.out.println("----------------------");
		Set<Entry<String, String>> entrys = map.entrySet();
		Iterator<Entry<String, String>> ent = entrys.iterator();
		while(ent.hasNext()){
			Entry<String,String> entry=ent.next();
			String entkey = entry.getKey();
			System.out.print(entkey+"::");
			String entval=entry.getValue();
			System.out.println(entval);
		}
	}

}















