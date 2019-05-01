package com.bit.am;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer[]> arr1=new ArrayList<Integer[]>();
		arr1.add(new Integer[]{1,2,3});
		arr1.add(new Integer[]{2222});
		arr1.add(new Integer[]{33,33});
		
		for(int i=0; i<arr1.size(); i++){
			Integer[] arr=arr1.get(i);
			System.out.println(Arrays.toString(arr));
		}
	}

}











