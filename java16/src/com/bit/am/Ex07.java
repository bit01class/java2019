package com.bit.am;

import java.util.ArrayList;

class Target{
	int su=1111;
}
public class Ex07 {
	

	public static void main(String[] args) {
		java.util.ArrayList arr=new ArrayList();
		
		arr.add(111);
		arr.add("string");
		arr.add('c');
		arr.add(false);
		Target tar=new Target();
		arr.add(tar);
		arr.add(new int[]{1,3,5,9});
		
//		System.out.println(arr.size());
		
		
		arr.remove(1);
		arr.remove(false);
		arr.remove(tar);
		
		
		arr.set(2, 1234);
		
		arr.add(1,"µÎ¹øÂ°");
		
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}
		
		System.out.println("-----------------------------");
		System.out.println(arr.indexOf(12345));
		ArrayList arr2=new ArrayList();
		arr2.add('c');
		arr2.add(111);
		System.out.println(arr2.isEmpty());
		
		arr.removeAll(arr2);
		
//		arr.clear();
//		System.out.println(arr.isEmpty());
		System.out.println("-----------------------------");
		
		ArrayList arr3=(ArrayList)arr.clone();//new ArrayList(arr);
		for(int i=0; i<arr3.size(); i++){
			System.out.println(arr3.get(i));
		}
		
		System.out.println("-----------------------------");
		
		Object[] objs=arr.toArray();
		
		for(int i=0; i<objs.length; i++){
			Object obj=objs[i];
			System.out.println(obj);
		}
		
		
	}

}
























