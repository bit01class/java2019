package com.bit.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex07 {

	public static void main(String[] args) {
		List<String> arr1=new ArrayList<String>();
		arr1=new LinkedList<String>();
		arr1.add("item1");
		arr1.add("item2");
		arr1.add("item3");
		arr1.add("item4");
		for(int i=0; i<arr1.size(); i++){
			String msg=arr1.get(i);
			System.out.println(msg);
		}
	}

}














