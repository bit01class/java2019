package com.bit.am;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09 {

	public static void main(String[] args) {
		Vector<String> vec1=new Vector<String>();
		
//		vec1.addElement("aaaa");
//		vec1.addElement("bbbb");
		vec1.add("aaaa");
		vec1.add("bbbb");
		vec1.add("ccccc");
		vec1.add("aaaa");
		
		Enumeration<String> eles = vec1.elements();
		while(eles.hasMoreElements()){
			String msg=eles.nextElement();
			System.out.println(msg);
		}
		///////////////////////////////////////
		System.out.println("-------------------------");
		Iterator<String> ite = vec1.iterator();
		while(ite.hasNext()){
			String msg=ite.next();
			System.out.println(msg);
		}
		///////////////////////////////////////
		System.out.println("-------------------------");
		ArrayList<String> arr1=new ArrayList<String>(vec1);
		for(int i=0; i<arr1.size(); i++){
			System.out.println(arr1.get(i));
		}
	}

}














