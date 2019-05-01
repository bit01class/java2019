package com.bit.day13;

public class Ex09 {

	public static void main(String[] args) {
		BitArray arr=new BitArray();
		arr.add(1111);
		arr.add(2222);
		
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}

}
